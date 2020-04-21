package com.example.aprendaingles.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {
    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btn10 = view.findViewById(R.id.btn10);
        btn11 = view.findViewById(R.id.btn11);
        btn12 = view.findViewById(R.id.btn12);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);

        return  view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.um);

                tocarSom();
                break;

            case R.id.btn2:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dois);
                tocarSom();
                break;

            case R.id.btn3:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.tres);
                tocarSom();
                break;
            case R.id.btn4:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.quatro);
                tocarSom();
                break;
            case R.id.btn5:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cinco);
                tocarSom();
                break;
            case R.id.btn6:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.seis);
                tocarSom();
                break;

            case R.id.btn7:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sete);
                tocarSom();
                break;
            case R.id.btn8:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.oito);
                tocarSom();
                break;
            case R.id.btn9:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.nove);
                tocarSom();
                break;
            case R.id.btn10:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dez);
                tocarSom();
                break;
            case R.id.btn11:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.onze);
                tocarSom();
                break;
            case R.id.btn12:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.doze);
                tocarSom();
                break;

        }
    }
    public  void tocarSom(){
        if(mediaPlayer !=null)
        {

            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }

    }

}
