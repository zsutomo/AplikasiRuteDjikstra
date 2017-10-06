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
public class Bantuan extends Fragment {


    public Bantuan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bantuan, container, false);

        DocumentView tv_bantuan = view.findViewById(R.id.textView_petunjuk);
        String str = "Aplikasi ini memiliki 3 buah tombol,\n yang terdiri dari Pencarian, Bantuan, dan About. <br/> 1. Tombol Pencarian berfungsi untuk melihat informasi pencarian lokasi pada peta. <br/> 2. Tombol Bantuan berfungsi sebagai petunjuk penggunaan aplikasi. <br/> 3. Tombol Tentang berfungsi untuk menampilkan Informasi pempek beringin. <br/> 4. Untuk keluar dari aplikasi ini anda bisa menekan tombol kembali pada handphone anda.";
        tv_bantuan.setText(Html.fromHtml(str));

        ImageView imageView = view.findViewById(R.id.img_back_bantuan);
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
