package com.example.fargment_27_10_20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CALL#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CALL extends Fragment {
    ListView list1;
    String number1[]={"976776776","6766678998","776767","6766678998","776767"};
    int pic1[]={R.drawable.facbook,R.drawable.ic_linkedin,R.drawable.ic_messenger,R.drawable.ic_whatsapp,R.drawable.instagram};
    int pic2[]={R.drawable.ic_phone,R.drawable.ic_video_call,R.drawable.ic_phone,R.drawable.ic_video_call,R.drawable.ic_phone,};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CALL() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment CALL.
     */
    // TODO: Rename and change types and number of parameters
    public static CALL newInstance() {
        CALL fragment = new CALL();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_c_a_l_l, container, false);
        list1=v.findViewById(R.id.list1);
        A adapte=new A(getContext(),pic1, number1,pic2);
        list1.setAdapter(adapte);
        return v;
    }
}