import com.cloudbees.hudson.plugins.folder.*
def m1()
{

Jenkins.instance.allItems.findAll() 
    { it instanceof AbstractProject }.each 
    {println it.fullName}


}


def m2()
{
for (int i=0;i<10;i++)
{
println i*10;
}
}
