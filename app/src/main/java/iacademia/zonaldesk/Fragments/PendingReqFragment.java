package iacademia.zonaldesk.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import iacademia.zonaldesk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PendingReqFragment extends android.app.Fragment {


    public PendingReqFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.pending_req, container, false);
        return rootView;
    }

}
