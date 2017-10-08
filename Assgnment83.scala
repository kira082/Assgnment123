object Assgnment83Assgnment83 {
   def main(args: Array[String]) {
/*  find count of all strings with length 4
convert the list of string to a list of integers, where each string is mapped to its
corresponding length 
*/   


var a : List[(int,String)] = List();
a = a:+((1,'‘alpha’'));
a = a:+((2,'‘beta’'));
a = a:+((3,'‘gamma’'));
a = a:+((4,'‘zeta’'));
a = a:+((5,'‘omega’'));

 var list[int] = a.toList;
  var count2 = 0;
  var count1 = 0;
 for ( i <- 0 to (list.length - 1)) {
/* find count of all strings which contain alphabet ‘m’  */
for ( i <- 0 to (list3.length - 1)) {
 var list4 =list(i).toArray;		
val comp = list4.toCharArray
    for (i <- comp){
        if ( "m" != comp(i))
            count2 = count2+1;
			break;
        }
		
    
    }

/*- find the count of all strings which start with the alphabet ‘a’*/
	var list3 =list.toArray;
 for ( i <- 0 to (list3.length - 1)) {
         var x = list3(i).charAt(0);
		 if(x =='a')
		 {
			count1 =count1+1;
		 }
      }

	
	
	}

	
 }
}
}