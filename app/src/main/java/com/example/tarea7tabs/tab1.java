package com.example.tarea7tabs;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class tab1 extends Fragment {
    VideoView videoView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1,container,false);
        Toast.makeText(getActivity(), "Estás en el tab Inicio", Toast.LENGTH_SHORT).show();

        videoView = view.findViewById(R.id.videoView);
        Uri uri = Uri.parse("https://www.sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4");
        videoView.setMediaController(new MediaController(getContext()));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        return view;

    }
}