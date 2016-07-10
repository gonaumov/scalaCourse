object Sheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val zones = java.util.TimeZone.getAvailableIDs  //> zones  : Array[String] = Array(Africa/Abidjan, Africa/Accra, Africa/Addis_Ab
                                                  //| aba, Africa/Algiers, Africa/Asmara, Africa/Asmera, Africa/Bamako, Africa/Ban
                                                  //| gui, Africa/Banjul, Africa/Bissau, Africa/Blantyre, Africa/Brazzaville, Afri
                                                  //| ca/Bujumbura, Africa/Cairo, Africa/Casablanca, Africa/Ceuta, Africa/Conakry,
                                                  //|  Africa/Dakar, Africa/Dar_es_Salaam, Africa/Djibouti, Africa/Douala, Africa/
                                                  //| El_Aaiun, Africa/Freetown, Africa/Gaborone, Africa/Harare, Africa/Johannesbu
                                                  //| rg, Africa/Juba, Africa/Kampala, Africa/Khartoum, Africa/Kigali, Africa/Kins
                                                  //| hasa, Africa/Lagos, Africa/Libreville, Africa/Lome, Africa/Luanda, Africa/Lu
                                                  //| bumbashi, Africa/Lusaka, Africa/Malabo, Africa/Maputo, Africa/Maseru, Africa
                                                  //| /Mbabane, Africa/Mogadishu, Africa/Monrovia, Africa/Nairobi, Africa/Ndjamena
                                                  //| , Africa/Niamey, Africa/Nouakchott, Africa/Ouagadougou, Africa/Porto-Novo, A
                                                  //| frica/Sao_Tome, Africa/Timbuktu, Africa/Tripoli, Africa/Tunis, Africa/Windho
                                                  //| ek, America/Adak, Americ
                                                  //| Output exceeds cutoff limit.
    zones.map(s => s.split("/")).filter(_.length > 1).map(x => x(1)).grouped(10).toArray.map(x => x(0))
                                                  //> res0: Array[String] = Array(Abidjan, Blantyre, Douala, Kinshasa, Mbabane, Ti
                                                  //| mbuktu, Argentina, Argentina, Belize, Catamarca, Curacao, Ensenada, Guatemal
                                                  //| a, Indiana, Kentucky, Managua, Mexico_City, Nome, Port-au-Prince, Rio_Branco
                                                  //| , St_Barthelemy, Tijuana, Davis, Vostok, Baghdad, Chongqing, Harbin, Kabul, 
                                                  //| Kuching, Novosibirsk, Saigon, Tehran, Vientiane, Faroe, Broken_Hill, NSW, Ac
                                                  //| re, Pacific, GMT+12, GMT-1, GMT-6, Amsterdam, Busingen, Kaliningrad, Monaco,
                                                  //|  San_Marino, Vaduz, Chagos, BajaNorte, Enderbury, Kiritimati, Pago_Pago, Tar
                                                  //| awa, EST5, Aleutian, Pacific-New)
}