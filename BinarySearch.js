function binary(list,searchData,start,end)
{
    if (start>end)
    {
        return false;
    }
    let mid=(start+end)/2;
    mid=parseInt(mid);
    if (list[mid]==searchData)
    {
        return true;
    }
    else if (list[mid]<searchData)
    {
        return binary(list,searchData,mid+1,end);
    }
    return binary(list,searchData,start,mid-1);
}


//This function is to check the binary search algorithm if the number passed is in the list.


function testBin(num)
{
    let lst=[1,2,3,4,5,6,7,8,9,11,23,44,67,123];
    return binary(lst,num,0,lst.length-1);
}
