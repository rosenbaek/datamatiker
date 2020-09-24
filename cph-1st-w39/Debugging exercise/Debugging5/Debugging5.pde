boolean jobsDone = true;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!"); //Add ;
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
