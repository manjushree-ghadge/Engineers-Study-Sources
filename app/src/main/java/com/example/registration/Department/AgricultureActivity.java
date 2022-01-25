package com.example.registration.Department;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.registration.Btn_Agri_Api_Activity;
import com.example.registration.Btn_Agri_Bio_Activity;
import com.example.registration.Btn_Agri_Boa_Activity;
import com.example.registration.Btn_Agri_Fm_Activity;
import com.example.registration.Btn_Agri_Sm_Activity;
import com.example.registration.Btn_Agri_Spm_Activity;
import com.example.registration.Btn_Agri_Tm_Activity;
import com.example.registration.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import org.jetbrains.annotations.NotNull;
import java.io.File;
import java.io.IOException;

public class AgricultureActivity extends AppCompatActivity {
    ImageView backBtn,fwarrow,fwarrow1,fwarrow2,fwarrow3,fwarrow4,fwarrow5,fwarrow6;
    private StorageReference mStorageReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);

        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/biotechnology.png");
        try {
            final File localFile = File.createTempFile("biotechnology","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_bio)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/basics_agri_eng.png");
        try {
            final File localFile = File.createTempFile("basics_agri_eng","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_basics_agri)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/stats_method.png");
        try {
            final File localFile = File.createTempFile("stats_method","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.stats_method)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/agri_industry.png");
        try {
            final File localFile = File.createTempFile("agri_industry","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_industry)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/tools_control_mchines.png");
        try {
            final File localFile = File.createTempFile("tools_control_mchines","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_tools_control)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/farm_machinery.png");
        try {
            final File localFile = File.createTempFile("farm_machinery","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_farm)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("agriculture/soil_mech_phy.png");
        try {
            final File localFile = File.createTempFile("soil_mech_phy","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(AgricultureActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.agri_soil_mech)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(AgricultureActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        fwarrow= findViewById(R.id.fwarrow);
        fwarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Bio_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow1= findViewById(R.id.fwarrow1);
        fwarrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Boa_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow2= findViewById(R.id.fwarrow2);
        fwarrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Sm_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow3= findViewById(R.id.fwarrow3);
        fwarrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Fm_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow4= findViewById(R.id.fwarrow4);
        fwarrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Spm_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow5= findViewById(R.id.fwarrow5);
        fwarrow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Tm_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow6= findViewById(R.id.fwarrow6);
        fwarrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgricultureActivity.this, Btn_Agri_Api_Activity.class);
                startActivity(intent);
            }
        });


        backBtn =  findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgricultureActivity.super.onBackPressed();
            }
        });

    }
}