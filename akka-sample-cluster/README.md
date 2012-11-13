Cluster Sample
==============

This sample is meant to be used by studying the code; it does not perform any
astounding functions when running it. If you want to run it, check out the akka
sources on your local hard drive, follow the [instructions for setting up Akka
with SBT](http://doc.akka.io/docs/akka/current/intro/getting-started.html).
When you start SBT within the checked-out akka source directory, you can run
this sample by typing in the sbt conole

   >run 
   >:

Multiple main classes detected, select one to run:

 [1] sample.cluster.stats.japi.StatsSampleClientMain
 [2] sample.cluster.transformation.japi.TransformationBackendMain
 [3] sample.cluster.transformation.TransformationFrontend
 [4] sample.cluster.transformation.TransformationBackend
 [5] sample.cluster.simple.japi.SimpleClusterApp
 [6] sample.cluster.stats.japi.StatsSampleMain
 [7] sample.cluster.stats.japi.StatsSampleOneMasterMain
 [8] sample.cluster.stats.StatsSample
 [9] sample.cluster.stats.StatsSampleOneMaster
 [10] sample.cluster.stats.StatsSampleClient
 [11] sample.cluster.stats.StatsSampleOneMasterClient
 [12] sample.cluster.simple.SimpleClusterApp
 [13] sample.cluster.transformation.japi.TransformationFrontendMain
 [14] sample.cluster.stats.japi.StatsSampleOneMasterClientMain

Enter number:


and then from another terminal start more cluster nodes like this:

  >sbt 

Then you can start and stop cluster nodes and observe the messages printed by
the remaining ones, demonstrating cluster membership changes.

You can read more in the [Akka docs](http://akka.io/docs).
