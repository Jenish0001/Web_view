package com.example.web_view.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.web_view.R;
import com.example.web_view.controller.My_Rv_Apdter1;
import com.example.web_view.model_class.Model_Class;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView rv_view;
    String[] name = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private RecyclerView rv_view1;
    String[] link = {"https://play.pokemonshowdown.com/"
            , "https://www.techradar.com/in/best/best-free-web-browser-games-10-games-you-have-to-play"
            , "https://www.crazygames.com/c/puzzle"
            , "https://www.crazygames.com/c/puzzle"
            , "https://chrome.google.com/webstore/category/extensions"
            , "https://www.openwebgames.com/#/home.html"
    };

    int[] set_img = {R.drawable.img1
            , R.drawable.img2
            , R.drawable.img3
            , R.drawable.img4
            , R.drawable.img5
            , R.drawable.img1


    };


    List<Model_Class> l1 = new ArrayList<>();
    List<Model_Class> l2 = new ArrayList<>();
    private ImageView menu_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        for (int i = 0; i < name.length; i++) {
            Model_Class model_class = new Model_Class(name[i], link[i], set_img[i]);
            l1.add(model_class);
        }
        My_Rv_Apdter1 adpter = new My_Rv_Apdter1(MainActivity.this, l1);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 3);
        rv_view1.setLayoutManager(manager);
        rv_view1.setAdapter(adpter);

        menu_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                show_dialog();


            }
        });


//        rv_view1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, WebView.class);
//                    String p1="https://www.crazygames.com/c/puzzle";
//                    intent.putExtra("n1",p1);
//                    startActivity(intent);
//
//
//            }
//        });
    }

    void show_dialog() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.item1);
//        dialog.setCancelable(false);
        dialog.show();
        RadioGroup rd_btn = dialog.findViewById(R.id.rd_btn);
        RadioButton rd_rb_puzzel = dialog.findViewById(R.id.rb_puzzel);
        RadioButton rb_racing = dialog.findViewById(R.id.rb_racing);
        RadioButton rb_action = dialog.findViewById(R.id.rb_action);
        RadioButton rb_cooking = dialog.findViewById(R.id.rb_cooking);
        RadioButton rb_shoping = dialog.findViewById(R.id.rb_shoping);
        Button btn = dialog.findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rd_btn.getCheckedRadioButtonId() == R.id.rb_puzzel) {

                    String[] link1 = {"https://www.mathsisfun.com/games/allout.html"
                            , "https://www.mathsisfun.com/games/ninja/alpha/"
                            , "https://www.mathsisfun.com/games/arrange.html"
                            , "https://www.mathsisfun.com/games/ninja/arty/"
                            , "https://www.mathsisfun.com/games/breaklock.html"

                    };
                    int[] set_img1 = {R.drawable.puzzel1
                            , R.drawable.imge1
                            , R.drawable.puzzel3
                            , R.drawable.puzzel4
                            , R.drawable.puzzel5

                    };
                    String[] puzzel1 = {"All Out", "Alpha Twist", "Arrange", "Arty Agent", "Breaklock"};
                    l1.clear();
                    l2.clear();
                    for (int i = 0; i < link1.length; i++) {

                        Model_Class model_class = new Model_Class(puzzel1[i], link1[i], set_img1[i]);
                        l2.add(model_class);


                    }

                    My_Rv_Apdter1 adpter = new My_Rv_Apdter1(MainActivity.this, l2);
                    RecyclerView.LayoutManager manager = new GridLayoutManager(MainActivity.this, 3);
                    rv_view1.setLayoutManager(manager);
                    rv_view1.setAdapter(adpter);


//                    Toast.makeText(MainActivity.this, "" + puzzel, Toast.LENGTH_SHORT).show();

                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rb_racing) {

//                    String racing = "racing";
//                    Toast.makeText(MainActivity.this, "" + racing, Toast.LENGTH_SHORT).show();

                    String[] link1 = {"https://poki.com/en/g/grand-prix-hero"
                            , "https://poki.com/en/g/merge-round-racers"
                            , "https://poki.com/en/g/super-star-car"
                            , "https://poki.com/en/g/adventure-drivers"
                            , "https://poki.com/en/g/merge-cyber-racers"


                    };

                    int[] set_img1 = {R.drawable.racing1
                            , R.drawable.racing2
                            , R.drawable.racing3
                            , R.drawable.racing
                            , R.drawable.puzzel5

                    };

                    String[] puzzel1 = {"Grand prix", "Super star", "super racing", "racing", "fight car "};
                    l1.clear();
                    l2.clear();
                    for (int i = 0; i < link1.length; i++) {

                        Model_Class model_class = new Model_Class(puzzel1[i], link1[i], set_img1[i]);
                        l2.add(model_class);

                    }
                    My_Rv_Apdter1 adpter = new My_Rv_Apdter1(MainActivity.this, l2);
                    RecyclerView.LayoutManager manager = new GridLayoutManager(MainActivity.this, 3);
                    rv_view1.setLayoutManager(manager);
                    rv_view1.setAdapter(adpter);


                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rb_action) {


                    String[] link1 = {
                            "https://www.crazygames.com/game/haunted-school---horror-game"
                            ,"https://vegamovies.cam/"
                            ,"https://poki.com/en/g/super-star-car"
                            ,"https://poki.com/en/g/adventure-drivers"
                            ,"https://poki.com/en/g/merge-cyber-racers"
                    };

                    int[] set_img1 = {R.drawable.racing1
                            , R.drawable.racing2
                            , R.drawable.racing3
                            , R.drawable.racing
                            , R.drawable.puzzel5
                    };

                    String[] puzzel1 = {"Grand prix", "Super star", "super racing", "racing", "fight car "};
                    l1.clear();
                    l2.clear();
                    for (int i = 0; i < link1.length; i++) {

                        Model_Class model_class = new Model_Class(puzzel1[i], link1[i], set_img1[i]);
                        l2.add(model_class);

                    }
                    My_Rv_Apdter1 adpter = new My_Rv_Apdter1(MainActivity.this, l2);
                    RecyclerView.LayoutManager manager = new GridLayoutManager(MainActivity.this, 3);
                    rv_view1.setLayoutManager(manager);
                    rv_view1.setAdapter(adpter);


                    Toast.makeText(MainActivity.this, "Action", Toast.LENGTH_SHORT).show();

                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rb_cooking) {
                    String cooking = "Cooking";
                    Toast.makeText(MainActivity.this, "" + cooking, Toast.LENGTH_SHORT).show();

                } else if (rd_btn.getCheckedRadioButtonId() == R.id.rb_shoping) {

                    String shopping = "Shopping";
                    Toast.makeText(MainActivity.this, "" + shopping, Toast.LENGTH_SHORT).show();

                }
                dialog.dismiss();

            }
        });


    }

    void blinding() {

        rv_view1 = findViewById(R.id.rv_view1);
        menu_view = findViewById(R.id.menu_view);
    }


}
