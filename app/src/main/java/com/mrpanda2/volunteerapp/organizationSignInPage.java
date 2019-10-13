package com.mrpanda2.volunteerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class organizationSignInPage extends Fragment {

    private TextView mHeader;
    private EditText mEmail;
    private EditText mPassword;
    private TextView mRequired;
    private Button mSignInButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_login);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.organization_sign_in, container, false);

        mHeader = (TextView) v.findViewById(R.id.VolSignInHeader);

        mEmail = (EditText) v.findViewById(R.id.VolEmailSignInField);

        mPassword = (EditText) v.findViewById(R.id.VolPassSignInField);

        mRequired = (TextView) v.findViewById(R.id.required);

        mSignInButton = (Button) v.findViewById(R.id.VolSignInButton);


        return v;
    }

}
