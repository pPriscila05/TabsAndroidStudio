package com.example.tarea7tabs;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tab2 extends Fragment {
    EditText usuario, contraseña;
    Button btGuardar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        Toast.makeText(getActivity(), "Estás en el tab Registro", Toast.LENGTH_SHORT).show();
        usuario = view.findViewById(R.id.editTextUser);
        contraseña = view.findViewById(R.id.editTextPassword);
        btGuardar = view.findViewById(R.id.btGuardar);
        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usuario.getText().toString();
                String password = contraseña.getText().toString();

                if (user.equals("") || password.equals("")){
                            AlertDialog.Builder  builder= new AlertDialog.Builder(getActivity());
                            builder.setTitle("¡ADVERTENCIA!");
                            builder.setMessage("Debe rellenar todos los campos.");
                            builder.setPositiveButton("Aceptar",null);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            builder.create();
                            builder.show();
                            usuario.requestFocus();
                }else{
                    AlertDialog.Builder  builder= new AlertDialog.Builder(getContext());
                    builder.setTitle("¡Información!");
                    builder.setMessage("Haz sido registrado correctamente.");
                    builder.setPositiveButton("Aceptar", null);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                    Intent intent = new Intent(getActivity(), logged.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("usuario", usuario.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
                }

        });return view;

    }

}