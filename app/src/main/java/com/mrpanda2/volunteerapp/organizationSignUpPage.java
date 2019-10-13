package com.mrpanda2.volunteerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class organizationSignUpPage extends Fragment {

    private TextView mHeader;
    private EditText mName;
    private EditText mEmail;
    private EditText mPassword;
    private TextView mRequired;
    private Button mSignInButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.organization_sign_up, container, false);

        mHeader = (TextView) v.findViewById(R.id.OrgSignUpHeader);

        mName = (EditText) v.findViewById(R.id.OrgNameSignUpField);

        mEmail = (EditText) v.findViewById(R.id.OrgEmailSignUpField);

        mPassword = (EditText) v.findViewById(R.id.OrgPassSignUpField);

        mRequired = (TextView) v.findViewById(R.id.required);

        mSignInButton = (Button) v.findViewById(R.id.OrgSignUpButton);

        return v;
    }

}
