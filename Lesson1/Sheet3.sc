object Sheet3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  "Mississippi".distinct                          //> res0: String = Misp
  "Rhine".permutations.toArray                    //> res1: Array[String] = Array(Rhine, Rhien, Rhnie, Rhnei, Rhein, Rheni, Rihne,
                                                  //|  Rihen, Rinhe, Rineh, Riehn, Rienh, Rnhie, Rnhei, Rnihe, Rnieh, Rnehi, Rneih
                                                  //| , Rehin, Rehni, Reihn, Reinh, Renhi, Renih, hRine, hRien, hRnie, hRnei, hRei
                                                  //| n, hReni, hiRne, hiRen, hinRe, hineR, hieRn, hienR, hnRie, hnRei, hniRe, hni
                                                  //| eR, hneRi, hneiR, heRin, heRni, heiRn, heinR, henRi, heniR, iRhne, iRhen, iR
                                                  //| nhe, iRneh, iRehn, iRenh, ihRne, ihRen, ihnRe, ihneR, iheRn, ihenR, inRhe, i
                                                  //| nReh, inhRe, inheR, ineRh, inehR, ieRhn, ieRnh, iehRn, iehnR, ienRh, ienhR, 
                                                  //| nRhie, nRhei, nRihe, nRieh, nRehi, nReih, nhRie, nhRei, nhiRe, nhieR, nheRi,
                                                  //|  nheiR, niRhe, niReh, nihRe, niheR, nieRh, niehR, neRhi, neRih, nehRi, nehiR
                                                  //| , neiRh, neihR, eRhin, eRhni, eRihn, eRinh, eRnhi, eRnih, ehRin, ehRni, ehiR
                                                  //| n, ehinR, ehnRi, ehniR, eiRhn, eiRnh, eihRn, eihnR, einRh, einhR, enRhi, enR
                                                  //| ih, enhRi, enhiR, eniRh, enihR)
  'A'.toInt                                       //> res2: Int = 65
  'B'.toInt                                       //> res3: Int = 66
  'C'.toInt                                       //> res4: Int = 67
  "ABC".sum.toInt                                 //> res5: Int = 198
  ('A' + 'B' + 'C').toChar                        //> res6: Char = Æ
   'Æ'.toInt                                      //> res7: Int = 198
   'Æ'.toDouble                                   //> res8: Double = 198.0
}