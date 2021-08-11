import com.cloudbees.hudson.plugins.folder.*
def m1()
{

    println 'Util.m1() was called '
    
    
 Jenkins.instance.getAllItems().each{
   println it.fullName
  }


}


def m2()
{
for (int i=0;i<10;i++)
{
println i*10;
}
}
