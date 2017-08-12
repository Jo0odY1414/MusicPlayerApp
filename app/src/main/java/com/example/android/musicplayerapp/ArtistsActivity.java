package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArtistsActivity extends Fragment {
    private static final String TAG = "Artists";

    ListView list ;
    List<MusicItem> musicList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.music_lists,container,false);

        list = (ListView)v.findViewById(R.id.list);
        musicList = new ArrayList<>();


        MusicItem onecallaway = new MusicItem(R.drawable.onecallaway_album,"Charlie Puth","One Call Away","BUY $9.99");
        MusicItem attention = new MusicItem(R.drawable.attention,"Charlie Puth","Attention","BUY $8.99");
        MusicItem despacito = new MusicItem(R.drawable.despacito,"Luis Fonsi","Despacito","BUY $19.99");
        MusicItem shapeofyou = new MusicItem(R.drawable.divide_album_edsheeran,"Ed Sheeran","Divide","BUY $11.99");
        musicList.add(onecallaway);
        musicList.add(attention);
        musicList.add(despacito);
        musicList.add(shapeofyou);
        ListAdapter adapter = new ListAdapter(getActivity(), musicList,2);
        list.setAdapter(adapter);


        return v;
    }
}