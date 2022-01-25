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
import com.example.registration.Btn_Elec_Cosy_Activity;
import com.example.registration.Btn_Elec_Elci_Activity;
import com.example.registration.Btn_Elec_Elements_Activity;
import com.example.registration.Btn_Elec_Em_Activity;
import com.example.registration.Btn_Elec_Ema_Activity;
import com.example.registration.Btn_Elec_Mp_Activity;
import com.example.registration.Btn_Elec_Nwas_Activity;
import com.example.registration.Btn_Elec_Ps_Activity;
import com.example.registration.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class ElectricalActivity extends AppCompatActivity {
    ImageView backBtn,fwarrow, fwarrow1,fwarrow2,fwarrow3,fwarrow4,fwarrow5,fwarrow6,fwarrow7;
    private StorageReference mStorageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);

        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/ele_machine.png");
        try {
            final File localFile = File.createTempFile("ele_machine","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_machines)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/power_system.png");
        try {
            final File localFile = File.createTempFile("power_system","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_power_system)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/processoer_controller.png");
        try {
            final File localFile = File.createTempFile("processoer_controller","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_mp_mc)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/eng_materials.png");
        try {
            final File localFile = File.createTempFile("eng_materials","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_materials)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/ele_circuits.png");
        try {
            final File localFile = File.createTempFile("ele_circuits","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_circuits)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/nwt_analysis.png");
        try {
            final File localFile = File.createTempFile("nwt_analysis","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_nwt)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/control_system.png");
        try {
            final File localFile = File.createTempFile("control_system","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_controlsystem)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical/ele_elements.png");
        try {
            final File localFile = File.createTempFile("ele_elements","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(ElectricalActivity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ele_element)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(ElectricalActivity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        fwarrow= findViewById(R.id.fwarrow);
        fwarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Em_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow1= findViewById(R.id.fwarrow1);
        fwarrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Ps_Activity.class);
                startActivity(intent);

            }
        });
        fwarrow2= findViewById(R.id.fwarrow2);
        fwarrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Mp_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow3= findViewById(R.id.fwarrow3);
        fwarrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Ema_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow4= findViewById(R.id.fwarrow4);
        fwarrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Elci_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow5= findViewById(R.id.fwarrow5);
        fwarrow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Nwas_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow6= findViewById(R.id.fwarrow6);
        fwarrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Cosy_Activity.class);
                startActivity(intent);
            }
        });
        fwarrow7= findViewById(R.id.fwarrow7);
        fwarrow7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectricalActivity.this, Btn_Elec_Elements_Activity.class);
                startActivity(intent);
            }
        });

        backBtn =  findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ElectricalActivity.super.onBackPressed();
            }
        });

    }
}
