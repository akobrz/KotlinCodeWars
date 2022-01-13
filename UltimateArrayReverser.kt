fun main(){
//    println(reverse(listOf("?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH")))
//    println(reverse(listOf("HEHIWAXUVH", "", "AXZ", "ZQRS", "", "Q", "CD", "ZOTOHTHZR", "WXRZQH", "FVZU", "BZ", "ZPWHMI", "HCCPYFTHOP", "RIVGIM", "EGZGHS", "K", "EJ", "GPZND", "KKPUI", "LZMBYD", "NBBOKSJOKL", "B", "JE", "CUSBRBAYY", "", "BEW", "MKCEGOLDOL", "K", "X", "ZPZWVH", "EUMQKL", "ODQU", "", "UT", "", "", "YYBKFHZO", "IYHHSKB", "AR", "PBGPMG", "TZ", "TTLDZEK", "DFREBGOIB", "ZKQPCFC", "POALJJUI", "MDEGQFUWHF", "VJBRTH", "FU", "ORPKIZKXIU", "", "JMQWIUW", "MOHSSW", "HY", "EZHFVUQIE", "BARKXDXEEI")))
//    println(reverse(listOf("Z", "QXCJLC", "BBXDC", "EJCPHUYW", "KIRDHQZXP", "QU", "P", "CU", "M", "OWUHOEU", "FQG", "YHH", "", "HATS", "EPQBDQCKI", "QFJGIOK", "CUWRVWXQSQ", "TPHSGRK", "LS", "CMJMS", "QUXTNOY", "QGMA", "HMM", "RTJRRX", "", "TKNW", "NWATWXFGWD", "EIOOTOLN", "EFOL", "SHCZJ", "IVKOTXJYJ", "AIP", "SBHVIPOKY", "GNRWXNF", "AXYIO", "SO", "TPKXMBEIK", "", "FFLK", "BMXU", "SWFMFPIR", "VLHDCHJ", "MB", "GCIPJYSOWZ", "QADFVF", "QRTJK", "", "GBF", "S", "CUHVJP", "SOXYAWDBVD", "HCKMTIRT", "BPZUCY", "ZVKHJHNT", "HOTHQEN", "FACRPTG", "QTDCFOF", "LLLO", "B", "HOEPF", "EIEG", "GMMYANVTR", "LON", "VXNB", "WUILGKD", "LRGVGPXO", "PZWMKHVBDJ", "", "DIBK", "YHCMMZPTB")))
    println(reverse(listOf("QQILOZ", "PZM", "TWHVVDVS", "HDW", "PVF", "HYC", "LHSPRAAW", "F", "GOXDZIQBEC", "GOCHV", "AJNW", "UACYVB", "IEXDVADOW", "BLNDYSF", "AY", "L", "WNKOGVK", "FCXZFEEZ", "PIBBHQ", "FZLYOTKJ", "NIYKI", "BPRTR", "C", "IKDHKLNMOI", "N", "MEKZS", "QGIDY", "MV", "SIQJUA", "CO", "TNXNQY")))
}

fun reverse(a: List<String>): List<String> {
    var t = mutableListOf<String>()
    var s = a.joinToString("").reversed()
    a.forEach {
        t.add(s.substring(0..(it.length-1)))
        s = s.substring(it.length)
    }
    return t
}