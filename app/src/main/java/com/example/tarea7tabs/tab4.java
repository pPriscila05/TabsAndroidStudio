package com.example.tarea7tabs;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tab4 extends Fragment {
    ListView listView;
    String[] playlist = {"Unholy - Sam Smith ft Kim Petras", "Hood Remix - Trueno ft Tiago PZK", "AUTOMÁTICO - María Becerra", "YaMeFui - Nicki Nicole, Duki, Bizarrap",
            "como si no importara - Emilia, Duki"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab4, container, false);
        Toast.makeText(getActivity(), "Estás en el tab Canciones", Toast.LENGTH_SHORT).show();
        listView = view.findViewById(R.id.playlist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, playlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos){
                    case 0:
                        Uri u1 = Uri.parse("https://open.spotify.com/track/3nqQXoyQOWXiESFLlDF1hG?si=2d1c962337024a06");
                        Intent int1 = new Intent(Intent.ACTION_VIEW,u1);
                        startActivity(int1);
                        break;
                    case 1:
                        Uri u2 = Uri.parse("https://open.spotify.com/track/3UytZp1xDkNkROyIwE7DbY?si=e60576bad25a4198");
                        Intent int2 = new Intent(Intent.ACTION_VIEW,u2);
                        startActivity(int2);
                        break;
                    case 2:
                        Uri u3 = Uri.parse("https://open.spotify.com/track/3Ne5uYDFzHEFYAPbaBMIck?si=e52902eb91064f56");
                        Intent int3 = new Intent(Intent.ACTION_VIEW,u3);
                        startActivity(int3);
                        break;
                    case 4:
                        Uri u4 = Uri.parse("https://open.spotify.com/track/42ahuAFlYGjIGBpVdHcLij?si=4365feb79ea14432");
                        Intent int4 = new Intent(Intent.ACTION_VIEW,u4);
                        startActivity(int4);
                        break;
                    case 5:
                        Uri u5 = Uri.parse("https://open.spotify.com/track/1GYJpuLq41vEVKXiHGEY9j?si=c692abd47d854349");
                        Intent int5 = new Intent(Intent.ACTION_VIEW,u5);
                        startActivity(int5);
                        break;
                }
            }
        });
        return view;
    }
}