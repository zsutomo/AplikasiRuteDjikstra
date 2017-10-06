package com.tugasakhir.bima.aplikasirutedjikstra;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bluejamesbond.text.DocumentView;


/**
 * A simple {@link Fragment} subclass.
 */
public class About extends Fragment {


    public About() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        DocumentView tv_bantuan = view.findViewById(R.id.textView_bantuan);
        String str = "Pempek Beringin adalah toko pempek yang menjadi andalan wisata kuliner kota Palembang, karena selain kualitas rasa pempeknya yang sudah sangat terkenal gurih dengan paduan cuko pempek yang sangat enak. Karena rasanya yang begitu khas, maka tidak ada alasan bagi anda untuk tidak mencobanya.\n" +
                "Bisnis Pempek Beringin dimulai di jalan Dempo luar dan sekarang sudah memiliki cabang di beberapa lokasi strategis, khususnya di pusat bisnis, pusat perkantoran dan pusat rekreasi di kota Palembang. Namun toko pempek Beringin sampai saat ini tidak membuka cabang di kota-kota lain, demi menekankan image bahwa toko pempek Beringin merupakan toko oleh” khas kota Palembang yang hanya ada di Palembang.";
        tv_bantuan.setText(Html.fromHtml(str));

        ImageView imageView = view.findViewById(R.id.img_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new Menu();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container,fragment);
                ft.commit();
            }
        });
        return view;
    }

}
