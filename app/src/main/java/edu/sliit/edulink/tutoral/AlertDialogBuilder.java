package edu.sliit.edulink.tutoral;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by drox2014 on 8/2/2017.
 */

public class AlertDialogBuilder {
    public static AlertDialog getWrongAnswerDialog(AppCompatActivity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Wrong Answer");
        builder.setMessage("Please try again");
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
    public static AlertDialog getCorrectAnswerDialog(AppCompatActivity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Correct Answer");
        builder.setMessage("Congratulations");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
}
