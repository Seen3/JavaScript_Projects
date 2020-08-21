//this function gives the nearest fibonacci number to the number given
function nearest(s,fir,sec)
{
    if(Math.abs(sec-s)<=Math.abs(fir-s)){
        return sec;
    }
    return fir;
}
function nearestFib(searchNum,first=1,second=1)
{
    if (searchNum>=first && searchNum<=second)
    {
        return nearest(searchNum,first,second);
    }
    let temp=first;
    first=second;
    second=first+temp;
    return nearestFib(searchNum,first,second);
}
function test()
{
  if (nearestFib(54)!=55)
  {
    return false;
  }
  if (nearestFib(99)!=89)
  {
    return false;
  }
  if(nearestFib(11)!=13)
  {
    return false;
  }
  return true;
}
