package com.example.registration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class Btn_Elec_Ps_Activity extends AppCompatActivity {
    ImageView backBtn,e4uarrow,eearrow,sdarrow,pos_basicarrow,pos_lecturearrow,pos_dcnarrow;

    Button b1,b2,b3;
    LinearLayout l1,l2,l3;
    private StorageReference mStorageReference;

    @Override
    protected void onCreate(Bundle posvedInstanceState) {
        super.onCreate(posvedInstanceState);
        setContentView(R.layout.activity_btn_elec_ps);



        b1 = (Button) findViewById(R.id.btn1);

        l1 = (LinearLayout) findViewById(R.id.l1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
            }
        });
        b2 = (Button) findViewById(R.id.btn2);
        l2 = (LinearLayout) findViewById(R.id.l2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.GONE);
                l2.setVisibility(View.VISIBLE);
                l3.setVisibility(View.GONE);
            }
        });
        b3 = (Button) findViewById(R.id.btn3);
        l3 = (LinearLayout) findViewById(R.id.l3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.GONE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.VISIBLE);
            }
        });

        backBtn = findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Btn_Elec_Ps_Activity.super.onBackPressed();

            }
        });
        //links activity
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical_logo/electric_4u.png");
        try {
            final File localFile = File.createTempFile("electrical_4u","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.e4u)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        e4uarrow= findViewById(R.id.e4uarrow);
        e4uarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("url_ele4").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });


            }
        });
        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical_logo/nptel.png");
        try {
            final File localFile = File.createTempFile("nptel","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.ee)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        eearrow= findViewById(R.id.eearrow);
        eearrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("url_nptel").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });


            }
        });

        mStorageReference = FirebaseStorage.getInstance().getReference().child("electrical_logo/science_direct.png");
        try {
            final File localFile = File.createTempFile("science_direct","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.sd)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        sdarrow= findViewById(R.id.sdarrow);
        sdarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("url_sciencedirect").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });


            }
        });

        // PDF ACTIVITY
        mStorageReference = FirebaseStorage.getInstance().getReference().child("computer_logo/pdf_logo.png");
        try {
            final File localFile = File.createTempFile("pdf_logo","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.pos_basic_pdf)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        pos_basicarrow= findViewById(R.id.pos_basicarrow);
        pos_basicarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("pdf/elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("basic_concept").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });
            }
        });



        mStorageReference = FirebaseStorage.getInstance().getReference().child("computer_logo/pdf_logo.png");
        try {
            final File localFile = File.createTempFile("pdf_logo","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.pos_lec_pdf)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        pos_lecturearrow= findViewById(R.id.pos_lecturearrow);
        pos_lecturearrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("pdf/elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("lec_note").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });
            }
        });



        mStorageReference = FirebaseStorage.getInstance().getReference().child("computer_logo/pdf_logo.png");
        try {
            final File localFile = File.createTempFile("pdf_logo","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Btn_Elec_Ps_Activity.this, "Image load successfully", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView) findViewById(R.id.pos_dcn_pdf)).setImageBitmap(bitmap);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull @NotNull Exception e) {
                    Toast.makeText(Btn_Elec_Ps_Activity.this, "Unable to load image", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        pos_dcnarrow= findViewById(R.id.pos_dcnarrow);
        pos_dcnarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference("pdf/elec_ps");
                firebaseDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        String url = "" + snapshot.child("short_note").getValue();
                        gotourl(url);
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });
            }
        });

    }

    private void gotourl(String url) {
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
