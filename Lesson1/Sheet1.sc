object Sheet1 {
  val a = 6*7                                     //> a  : Int = 42
  a                                               //> res0: Int = 42
  val b : BigInt  = 6*7                           //> b  : BigInt = 42
  b.pow(1000)                                     //> res1: scala.math.BigInt = 177537621757568248950234599270607852660252413389333
                                                  //| 83012186643321847083242144360327036969980668747408910492878771642920564679796
                                                  //| 82934737077049464296605508272514364193647791450330862622357351968709701692689
                                                  //| 36263397939762105248176659434097650004506884755804774234658017655345759054920
                                                  //| 49196468785909279428695188819689325775351296131230314250019907682867238840394
                                                  //| 75329857509148162013746924850245250142292273919281341483030761218960837851444
                                                  //| 58058663924538382048916216555803135162559498594486565145539791797721890644779
                                                  //| 92787866443688316538221150064779123867423281262710162087674166979665037034280
                                                  //| 16749799091197870288671741073316507101401112929443006664348800957958770979905
                                                  //| 72495268381802859353757531851506209883392944773390720438443923124109419130052
                                                  //| 41294041805205683695066329052958869178531727752733481737640922341653756533381
                                                  //| 10417193480917514902717112293281089023929392425543606079300055100344172202132
                                                  //| 0032429257207506318460341
                                                  //| Output exceeds cutoff limit.
}