package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends Fragment {
    private static final String TAG = "SONGS";

    ListView list ;
    List<MusicItem> musicList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.music_lists,container,false);

        list = (ListView)v.findViewById(R.id.list);
        musicList = new ArrayList<MusicItem>();


        MusicItem onecallaway = new MusicItem(R.drawable.onecallaway_album,"One Call Away","Charlie Puth",R.raw.onecallaway);
        MusicItem attention = new MusicItem(R.drawable.attention,"Attention","Charlie Puth",R.raw.attention);
        MusicItem despacito = new MusicItem(R.drawable.despacito,"Despacito","Luis Fonsi",R.raw.despacito);
        MusicItem shapeofyou = new MusicItem(R.drawable.divide_album_edsheeran,"Shape of you","Ed Sheeran",R.raw.shapeofyou);
        musicList.add(onecallaway);
        musicList.add(attention);
        musicList.add(despacito);
        musicList.add(shapeofyou);
        ListAdapter adapter = new ListAdapter(getActivity(), musicList,1);
        list.setAdapter(adapter);


        return v;
    }
}
