package com.example.atividadelista;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    Activity activity;
    //definir o tipo do arraylist(geralmente o model)
    ArrayList<ModelAnime> customListDataModelArrayList = new ArrayList<>();
    LayoutInflater layoutInflater = null;

    public CustomListAdapter(Activity activity, ArrayList customListDataModelArray){
        this.activity=activity;
        this.customListDataModelArrayList = customListDataModelArray;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return customListDataModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return customListDataModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private static class ViewHolder{
        //componentes no list_view_item.xml
        ImageView imageView;
        TextView textViewAnime,textViewIdade, textViewNome, textViewSexo;

    }
    ViewHolder viewHolder = null;


    // this method  is called each time for arraylist data size.
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View vi=view;
        final int pos = position;

        if(vi == null){

            // create  viewholder object for list_rowcell View.
            viewHolder = new ViewHolder();
            // inflate list_rowcell for each row
            //associar java com xml
            vi = layoutInflater.inflate(R.layout.list_view_item,null);
            viewHolder.imageView = (ImageView) vi.findViewById(R.id.imageView);
            viewHolder.textViewAnime = (TextView) vi.findViewById(R.id.textViewAnime);
            viewHolder.textViewIdade = (TextView) vi.findViewById(R.id.textViewIdade);
            viewHolder.textViewNome = (TextView) vi.findViewById(R.id.textViewNome);
            viewHolder.textViewSexo = (TextView) vi.findViewById(R.id.textViewSexo);
            /*We can use setTag() and getTag() to set and get custom objects as per our requirement.
            The setTag() method takes an argument of type Object, and getTag() returns an Object.*/
            vi.setTag(viewHolder);
        }else {

            /* We recycle a View that already exists */
            viewHolder= (ViewHolder) vi.getTag();
        }

        //associa os itens do vetor aos componentes xml
        viewHolder.textViewAnime.setText(
                customListDataModelArrayList.get(pos).Anime);
        viewHolder.textViewIdade.setText(
                customListDataModelArrayList.get(pos).Age);
        viewHolder.textViewNome.setText(
                customListDataModelArrayList.get(pos).Name);
        viewHolder.textViewSexo.setText(
                customListDataModelArrayList.get(pos).Sex);
        viewHolder.imageView.setImageResource(
                customListDataModelArrayList.get(pos).ImageId);
        //façam o da imagem

        vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetalhesActivity.class);
                // Passe os detalhes do item como extras para a nova Activity
                ModelAnime anime = customListDataModelArrayList.get(pos);
                intent.putExtra("anime", anime.Anime);
                intent.putExtra("idade", String.valueOf(anime.Age));
                intent.putExtra("nome", anime.Name);
                intent.putExtra("sexo", anime.Sex);
                intent.putExtra("raca", anime.Race);
                intent.putExtra("voz", anime.Voice);
                intent.putExtra("altura", anime.Altura);
                intent.putExtra("peso", anime.weight);
                intent.putExtra("imagemId", anime.ImageId);
                // Adicione outros extras conforme necessário

                // Inicie a nova Activity
                activity.startActivity(intent);
            }
        });

        return vi;
    }
}