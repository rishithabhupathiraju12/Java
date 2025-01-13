public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday==true){
    if(speed-5<=60){
      return 0;
    }
    else if(speed-5 >= 61 && speed-5 <=80){
      return 1;
    }
    else{
      return 2;
    }
  }else{
        if(speed<=60){
      return 0;
    }
    else if(speed >= 61 && speed <=80){
      return 1;
    }
    else{
      return 2;
    }

  }
}
