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
import com.example.registration.Btn_Electronics_Ds_Activity;
import com.example.registration.Btn_Electronics_Eac_Activity;
import com.example.registration.Btn_Mech_Dom_Activity;
import com.example.registration.Btn_Mech_Kom_Activity;
import com.example.registration.Btn_Mech_Md_Activity;
import com.example.registration.Btn_Mech_Mm_Activity;
import com.example.registration.Btn_Mech_Mt_Activity;
import com.example.registration.Btn_Mech_Pp_Activity;
import com.example.registration.Btn_Mech_Thermo_Activity;
import com.example.registration.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class MechanicalActivity extends AppCompatActivity {
    ImageView backBtn,fwarrow,fwarrow1,fwarrow2,fwarrow3,fwarrow4,fwarrow5,fwarrow6;
            ;
    private StorageReference mStorageReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);

        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/thermodynamics.png");
        try {
            final File localFile = File.createTempFile("thermodynamics","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_thermo)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/kinematics_machinery.png");
        try {
            final File localFile = File.createTempFile("kinematics_machinery","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_kinematics)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/machine_design.png");
        try {
            final File localFile = File.createTempFile("machine_design","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_machine_design)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/mechanical_measurements.png");
        try {
            final File localFile = File.createTempFile("mechanical_measurements","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_mesuremnts)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/dyanamics_machinery.png");
        try {
            final File localFile = File.createTempFile("dyanamics_machinery","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_dynamics)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/production_planning.png");
        try {
            final File localFile = File.createTempFile("production_planning","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_production_plan)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("mechanical/manufacturing_techno.png");
        try {
            final File localFile = File.createTempFile("manufacturing_techno","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MechanicalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.mech_manufactre_techno)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(MechanicalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        fwarrow= findViewById(R.id.fwarrow);
        fwarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Thermo_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow1= findViewById(R.id.fwarrow1);
        fwarrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Kom_Activity.class);
                startActivity(intent);

            }
        });
        fwarrow2= findViewById(R.id.fwarrow2);
        fwarrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Md_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow3= findViewById(R.id.fwarrow3);
        fwarrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Mm_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow4= findViewById(R.id.fwarrow4);
        fwarrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Dom_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow5= findViewById(R.id.fwarrow5);
        fwarrow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Pp_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow6= findViewById(R.id.fwarrow6);
        fwarrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MechanicalActivity.this, Btn_Mech_Mt_Activity.class);
                startActivity(intent);
            }
        });


        backBtn =  findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MechanicalActivity.super.onBackPressed();
            }
        });

    }
}
