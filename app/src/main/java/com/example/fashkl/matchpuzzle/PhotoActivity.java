package com.example.fashkl.matchpuzzle;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhotoActivity extends AppCompatActivity {

    private ImageView index;
//    private HashMap<String, String> HashMap = new HashMap<>();
    private Integer[] photos = {
            R.drawable.photo5,
            R.drawable.photo0,
            R.drawable.photo4,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo4,
            R.drawable.photo5,
            R.drawable.photo0,
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo1,
    };

    private ImageView photo1, photo2, photo3, photo4,
            photo5, photo6, photo7, photo8, photo9, photo10, photo11, photo12;
    private List<String> list = new ArrayList<>();
    private int w = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        photo1 = (ImageView) findViewById(R.id.photo1);
        photo2 = (ImageView) findViewById(R.id.photo2);
        photo3 = (ImageView) findViewById(R.id.photo3);
        photo4 = (ImageView) findViewById(R.id.photo4);
        photo5 = (ImageView) findViewById(R.id.photo5);
        photo6 = (ImageView) findViewById(R.id.photo6);
        photo7 = (ImageView) findViewById(R.id.photo7);
        photo8 = (ImageView) findViewById(R.id.photo8);
        photo9 = (ImageView) findViewById(R.id.photo9);
        photo10 = (ImageView) findViewById(R.id.photo10);
        photo11 = (ImageView) findViewById(R.id.photo11);
        photo12 = (ImageView) findViewById(R.id.photo12);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
//        outState.putSerializable("photo1", HashMap.get("photo1"));
//        outState.putSerializable("photo2", HashMap.get("photo2"));
//        outState.putSerializable("photo3", HashMap.get("photo3"));
//        outState.putSerializable("photo4", HashMap.get("photo4"));
//        outState.putSerializable("photo5", HashMap.get("photo5"));
//        outState.putSerializable("photo6", HashMap.get("photo6"));
//        outState.putSerializable("photo7", HashMap.get("photo7"));
//        outState.putSerializable("photo8", HashMap.get("photo8"));
//        outState.putSerializable("photo9", HashMap.get("photo9"));
//        outState.putSerializable("photo11", HashMap.get("photo11"));
//        outState.putSerializable("photo12", HashMap.get("photo12"));
//        outState.putSerializable("photo10", HashMap.get("photo10"));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        try {

        } catch (Exception f) {

        }
    }

    public void clickHandle(View view) {

        switch (view.getId()) {
            case R.id.photo1:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[0]));
                    photo1.setImageResource(photos[0]);
                    index = (ImageView) view.findViewById(R.id.photo1);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[0]))) {
                        photo1.setImageResource(photos[0]);
                        list.clear();
                        index.setEnabled(false);
                        photo1.setEnabled(false);
                        //HashMap.put(photo1.toString(), photos[0].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo1.setImageResource(photos[0]);

                            }

                            @Override
                            public void onFinish() {
                                photo1.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo2:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[1]));
                    photo2.setImageResource(photos[1]);
                    index = (ImageView) view.findViewById(R.id.photo2);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[1]))) {
                        photo2.setImageResource(photos[1]);
                        list.clear();
                        index.setEnabled(false);
                        photo2.setEnabled(false);
                        //HashMap.put(photo2.toString(), photos[1].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo2.setImageResource(photos[1]);

                            }

                            @Override
                            public void onFinish() {
                                photo2.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo3:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[2]));
                    photo3.setImageResource(photos[2]);
                    index = (ImageView) view.findViewById(R.id.photo3);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[2]))) {
                        photo3.setImageResource(photos[2]);
                        list.clear();
                        index.setEnabled(false);
                        photo3.setEnabled(false);
                        //HashMap.put(photo3.toString(), photos[2].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo3.setImageResource(photos[2]);

                            }

                            @Override
                            public void onFinish() {
                                photo3.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo4:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[3]));
                    photo4.setImageResource(photos[3]);
                    index = (ImageView) view.findViewById(R.id.photo4);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[3]))) {
                        photo4.setImageResource(photos[3]);
                        list.clear();
                        index.setEnabled(false);
                        photo4.setEnabled(false);
//                        //HashMap.put(photo4.toString(), photos[3].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo4.setImageResource(photos[3]);

                            }

                            @Override
                            public void onFinish() {
                                photo4.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo5:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[4]));
                    photo5.setImageResource(photos[4]);
                    index = (ImageView) view.findViewById(R.id.photo5);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[4]))) {
                        photo5.setImageResource(photos[4]);
                        list.clear();
                        index.setEnabled(false);
                        photo5.setEnabled(false);
                        //HashMap.put(photo5.toString(), photos[4].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo5.setImageResource(photos[4]);

                            }

                            @Override
                            public void onFinish() {
                                photo5.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo6:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[5]));
                    photo6.setImageResource(photos[5]);
                    index = (ImageView) view.findViewById(R.id.photo6);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[5]))) {
                        photo6.setImageResource(photos[5]);
                        list.clear();
                        index.setEnabled(false);
                        photo6.setEnabled(false);
                        //HashMap.put(photo6.toString(), photos[5].toString());
                        w++;
                        winner(w);
                        index = null;
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo6.setImageResource(photos[5]);

                            }

                            @Override
                            public void onFinish() {
                                photo6.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo7:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[6]));
                    photo7.setImageResource(photos[6]);
                    index = (ImageView) view.findViewById(R.id.photo7);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[6]))) {
                        photo7.setImageResource(photos[6]);
                        list.clear();
                        index.setEnabled(false);
                        photo7.setEnabled(false);
                        //HashMap.put(photo7.toString(), photos[6].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo7.setImageResource(photos[6]);

                            }

                            @Override
                            public void onFinish() {
                                photo7.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo8:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[7]));
                    photo8.setImageResource(photos[7]);
                    index = (ImageView) view.findViewById(R.id.photo8);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[7]))) {
                        photo8.setImageResource(photos[7]);
                        list.clear();
                        index.setEnabled(false);
                        photo8.setEnabled(false);
                        //HashMap.put(photo8.toString(), photos[7].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo8.setImageResource(photos[7]);

                            }

                            @Override
                            public void onFinish() {
                                photo8.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo9:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[8]));
                    photo9.setImageResource(photos[8]);
                    index = (ImageView) view.findViewById(R.id.photo9);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[8]))) {
                        photo9.setImageResource(photos[8]);
                        list.clear();
                        index.setEnabled(false);
                        photo9.setEnabled(false);
                        //HashMap.put(photo9.toString(), photos[8].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo9.setImageResource(photos[8]);

                            }

                            @Override
                            public void onFinish() {
                                photo9.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo10:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[9]));
                    photo10.setImageResource(photos[9]);
                    index = (ImageView) view.findViewById(R.id.photo10);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[9]))) {
                        photo10.setImageResource(photos[9]);
                        list.clear();
                        index.setEnabled(false);
                        photo10.setEnabled(false);
                        //HashMap.put(photo10.toString(), photos[9].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo10.setImageResource(photos[9]);

                            }

                            @Override
                            public void onFinish() {
                                photo10.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo11:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[10]));
                    photo11.setImageResource(photos[10]);
                    index = (ImageView) view.findViewById(R.id.photo11);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[10]))) {
                        photo11.setImageResource(photos[10]);
                        list.clear();
                        index.setEnabled(false);
                        photo11.setEnabled(false);
                        //HashMap.put(photo11.toString(), photos[10].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo11.setImageResource(photos[10]);

                            }

                            @Override
                            public void onFinish() {
                                photo11.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();
                    }
                }
                break;
            case R.id.photo12:
                if (list.size() == 0) {
                    list.add(String.valueOf(photos[11]));
                    photo12.setImageResource(photos[11]);
                    index = (ImageView) view.findViewById(R.id.photo12);

                } else {
                    if (list.get(0).equals(String.valueOf(photos[11]))) {
                        photo12.setImageResource(photos[11]);
                        list.clear();
                        index.setEnabled(false);
                        photo12.setEnabled(false);
                        //HashMap.put(photo12.toString(), photos[11].toString());
                        w++;
                        winner(w);
                    } else {
                        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                photo12.setImageResource(photos[11]);

                            }

                            @Override
                            public void onFinish() {
                                photo12.setImageResource(R.drawable.images);
                                index.setImageResource(R.drawable.images);
                                list.clear();
                            }
                        }.start();

                    }
                }
                break;
        }

    }

    private void winner(int w) {
        if (w == 6) {
            Toast.makeText(PhotoActivity.this, "  (:   you are winner     :)", Toast.LENGTH_SHORT).show();
        }
    }


}
