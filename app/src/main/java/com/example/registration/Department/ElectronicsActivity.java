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

import com.example.registration.Btn_Cs_Ai_Activity;
import com.example.registration.Btn_Cs_Cd_Activity;
import com.example.registration.Btn_Cs_Cn_Activity;
import com.example.registration.Btn_Cs_Dbms_Activity;
import com.example.registration.Btn_Cs_Ds_Activity;
import com.example.registration.Btn_Cs_Os_Activity;
import com.example.registration.Btn_Cs_Se_Activity;
import com.example.registration.Btn_Cs_Toc_Activity;
import com.example.registration.Btn_Electronics_Dcn_Activity;
import com.example.registration.Btn_Electronics_Ds_Activity;
import com.example.registration.Btn_Electronics_Eac_Activity;
import com.example.registration.Btn_Electronics_Ict_Activity;
import com.example.registration.Btn_Electronics_Pe_Activity;
import com.example.registration.Btn_Electronics_Ss_Activity;
import com.example.registration.Btn_Electronics_Vlsi_Activity;
import com.example.registration.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class ElectronicsActivity extends AppCompatActivity {
    ImageView backBtn,fwarrow,fwarrow1,fwarrow2,fwarrow3,fwarrow4,fwarrow5,fwarrow6,fwarrow7;
    private StorageReference mStorageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/ec_circuits.png");
        try {
            final File localFile = File.createTempFile("ec_circuits","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_circuits)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/digital_system.png");
        try {
            final File localFile = File.createTempFile("digital_system","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_digital_system)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/signal_systems.png");
        try {
            final File localFile = File.createTempFile("signal_systems","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_signal_sytems)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/design_nwt.png");
        try {
            final File localFile = File.createTempFile("design_nwt","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_design_nwt)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/digital_communication.png");
        try {
            final File localFile = File.createTempFile("digital_communication","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_digital_comm)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/ic_technology.png");
        try {
            final File localFile = File.createTempFile("ic_technology","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_ic_techno)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/vlsi_design.png");
        try {
            final File localFile = File.createTempFile("vlsi_design","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_vlsi_design)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electronics/power_ec.png");
        try {
            final File localFile = File.createTempFile("power_ec","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectronicsActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ec_powerec)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectronicsActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        fwarrow= findViewById(R.id.fwarrow);
        fwarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Eac_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow1= findViewById(R.id.fwarrow1);
        fwarrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Ds_Activity.class);
                startActivity(intent);

            }
        });
        fwarrow2= findViewById(R.id.fwarrow2);
        fwarrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Ss_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow3= findViewById(R.id.fwarrow3);
        fwarrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Dcn_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow4= findViewById(R.id.fwarrow4);
        fwarrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Ds_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow5= findViewById(R.id.fwarrow5);
        fwarrow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Ict_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow6= findViewById(R.id.fwarrow6);
        fwarrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Vlsi_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow7= findViewById(R.id.fwarrow7);
        fwarrow7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicsActivity.this, Btn_Electronics_Pe_Activity.class);
                startActivity(intent);
            }
        });

        backBtn =  findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ElectronicsActivity.super.onBackPressed();
            }
        });

    }
}
