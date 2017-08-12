package com.example.android.musicplayerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a0 on 12‏/8‏/2017.
 */

public class ListAdapter extends BaseAdapter {

    Context context;
    List<MusicItem> songs;
    int flag = 0;


    public ListAdapter(Context context, List<MusicItem> songs, int flag) {
        this.context = context;
        this.songs = songs;
        this.flag = flag;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(R.layout.music_item, parent, false);

        ImageView musicImg = (ImageView) v.findViewById(R.id.musicImg);
        TextView AudioName = (TextView) v.findViewById(R.id.AudioName);
        TextView AudioArtist = (TextView) v.findViewById(R.id.AudioArtist);
        ImageView PlayIcon = (ImageView) v.findViewById(R.id.PlayIcon);
        Button buySong = (Button) v.findViewById(R.id.buySong);

        AudioName.setText(String.valueOf(songs.get(position).getNameSong()));
        AudioArtist.setText(String.valueOf(songs.get(position).getArtistsName()));
        musicImg.setImageResource(songs.get(position).getImage());

        if (flag == 1) {
            buySong.setVisibility(View.GONE);
        } else if (flag == 2) {
            PlayIcon.setVisibility(View.GONE);
            AudioName.setText(String.valueOf(songs.get(position).getArtistsName()));
            AudioArtist.setText(String.valueOf(songs.get(position).getAlbumName()));
            buySong.setText(String.valueOf(songs.get(position).getPrice()));
        } else if (flag == 3) {
            PlayIcon.setVisibility(View.GONE);
            AudioName.setText(String.valueOf(songs.get(position).getAlbumName()));
            buySong.setText(String.valueOf(songs.get(position).getPrice()));
        }

        return v;
    }
}
