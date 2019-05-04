

val myset = Set(2, 2, 3,4,4,6 ,7);

println(myset.mkString(","));
// note the myset(index) is actuall not a index but a value comparison
/// when i say myset(10) it check if value 10 exists inside the set and returns
//  a boolean value
println(myset(10));

// functional methods on set
println(myset.head);
println(myset.tail);
println(myset.size);
println(myset.take(2));

for(el <- myset){
  println(el);
}
/// this is foreach as function
myset.foreach((el)=>{
  println(el);
});