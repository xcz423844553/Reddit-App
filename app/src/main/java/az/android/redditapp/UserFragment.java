package az.android.redditapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class UserFragment extends Fragment {

    private EditText mUsername;
    private EditText mPassword;

    public UserFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        mUsername = view.findViewById(R.id.et_username);
        mPassword = view.findViewById(R.id.et_password);

        return view;
    }

}
