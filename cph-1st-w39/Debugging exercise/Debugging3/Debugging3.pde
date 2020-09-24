boolean jobsDone = false;

void setup()
{
    if (!isJobDone()) //add !
    {
        println("Job's done!");   
    }
}

boolean isJobDone() //Change to boolean
{
    return jobsDone;    
}
