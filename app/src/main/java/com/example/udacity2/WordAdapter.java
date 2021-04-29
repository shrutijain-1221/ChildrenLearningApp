 package com.example.udacity2;

import android.app.Activity;
//import android.support.v4.content.ContextCompat;
import android.app.LauncherActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    private int mccolorId;
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
public WordAdapter(Activity context, ArrayList<Word> Word,int colorId){
    super(context,0,Word);
    mccolorId=colorId;
}
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word currentAndroid = getItem(position);

        TextView numberTextView = listItemView.findViewById(R.id.defaultview);

        numberTextView.setText(currentAndroid.getDefaulttranslation());

        TextView nameTextView = listItemView.findViewById(R.id.miwok);

        nameTextView.setText(currentAndroid.getMiwokTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
       // iconView.setImageResource(currentAndroid.getImageSourceId());

View textConatiner= listItemView.findViewById(R.id.text_container);
int color= ContextCompat.getColor(getContext(),mccolorId);
if(currentAndroid.hasImage()){ iconView.setImageResource(currentAndroid.getImageSourceId());
iconView.setVisibility(View.VISIBLE);
}
else{
   iconView.setVisibility(View.GONE);
}
textConatiner.setBackgroundColor(color);
        return listItemView;
    }
}
