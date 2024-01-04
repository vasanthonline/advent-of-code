

fun findCommonDirection(direction: CharArray, maps: Map<String, Pair<String, String>>): Long {
    val ip = maps.keys.filter { it.endsWith('A') }.map { Pair(it, 0) }
    var inputs = Triple(0, -1, ip)

    while (true) {
        val dir = if(inputs.second + 1 == direction.size) 0 else inputs.second + 1
        inputs = Triple( inputs.first + 1, dir, inputs.third.map { input ->
            if(input.first.endsWith('Z'))
                input
            else {
                when(direction[dir]) {
                    'L' -> Pair(maps[input.first]!!.first, input.second + 1)
                    'R'-> Pair(maps[input.first]!!.second, input.second + 1)
                    else -> input
                }
            }
        })
        if(inputs.third.map { it.first }.filter { it.endsWith('Z') }.size == ip.size) {
            val counts = inputs.third.map { it.second.toLong() }
            return lcm(counts)
            break
        }
    }
}

fun gcd(a: Long, b: Long) : Long {
    var aCopy = a
    var bCopy = b
    while (bCopy > 0) {
        val temp = bCopy
        bCopy = aCopy % bCopy // % is remainder
        aCopy = temp
    }
    return aCopy
}

fun lcm(a: Long, b: Long): Long {
    return a * (b / gcd(a, b))
}
fun lcm(nums: List<Long>): Long {
    var result = nums[0]
    for(i in 1 until nums.size){
        result = lcm(result, nums[i])
    }
    return result
}
fun main() {
    val direction = "LRLRLRLLRRLRRLRRRLRRLRLLRRRLRRRLRRLLLLRRRLRLLRRLRRLRRLLLRRRLRRRLRRLRLRRLRLRLRLLRRRLRRRLLRRRLRRRLRRRLRLLLRRLRLRRRLRLRRRLLRRRLRLLRLRRRLRLRRRLRRLLRLRLRRLRLRLRRLRLRLRRRLRRLRLLRRLRRRLRRRLRRLRRRLRRLRLRRRLLRRRLLRRLRLRRRLRRRLLRRRLRLRRLRLRLRRLRLLRRLRLRLRRLRRRLRRRLRLRRLRRLLLRRRLLRLRRRLLRRRR".toCharArray()

    val maps = mapOf(
        "NBN" to Pair("BKF", "NNH"),
        "NSM" to Pair("RFT", "QQM"),
        "BDR" to Pair("HRB", "KQB"),
        "LGM" to Pair("CQJ", "XJQ"),
        "CQL" to Pair("BDX", "FBN"),
        "SNH" to Pair("HXS", "HCC"),
        "BBL" to Pair("FMD", "LVM"),
        "GDF" to Pair("QQJ", "VBM"),
        "NVN" to Pair("QQR", "XFD"),
        "MMQ" to Pair("PHP", "PHP"),
        "TPH" to Pair("BNM", "MXC"),
        "NDR" to Pair("MSQ", "RGL"),
        "KRL" to Pair("RGM", "RSP"),
        "KJR" to Pair("MRD", "TJC"),
        "NBB" to Pair("JLM", "JQQ"),
        "AAA" to Pair("FHJ", "QHN"),
        "KFB" to Pair("BXG", "RSN"),
        "XFS" to Pair("QMB", "KKF"),
        "CDK" to Pair("HDD", "JVJ"),
        "GDB" to Pair("GQT", "DSN"),
        "RXL" to Pair("MJL", "XFS"),
        "FGM" to Pair("MBR", "GFS"),
        "DCM" to Pair("HDD", "JVJ"),
        "HLJ" to Pair("XPK", "CTT"),
        "PMS" to Pair("GHH", "VQH"),
        "KVP" to Pair("QDD", "QDD"),
        "HMS" to Pair("FJG", "NKX"),
        "LNF" to Pair("HSN", "PVN"),
        "HNN" to Pair("FVC", "FMN"),
        "NHK" to Pair("PQX", "XXX"),
        "GSL" to Pair("CVK", "TCT"),
        "MSV" to Pair("DFT", "FVR"),
        "RGF" to Pair("NVH", "RJG"),
        "XQT" to Pair("PVM", "LDD"),
        "QNX" to Pair("NTM", "DXG"),
        "MVX" to Pair("RBK", "VSL"),
        "QTF" to Pair("QKN", "LQK"),
        "NFV" to Pair("MVG", "KCT"),
        "MHL" to Pair("SVN", "RHM"),
        "VSL" to Pair("BLJ", "XMX"),
        "MJL" to Pair("KKF", "QMB"),
        "FMB" to Pair("RHM", "SVN"),
        "DTT" to Pair("JRG", "HBQ"),
        "RSV" to Pair("JLP", "QKR"),
        "QMV" to Pair("HNN", "TND"),
        "GXF" to Pair("JQQ", "JLM"),
        "KSQ" to Pair("VKQ", "STJ"),
        "MDL" to Pair("LNQ", "DQF"),
        "DQF" to Pair("HLJ", "VVN"),
        "FDD" to Pair("DDM", "GMM"),
        "RDD" to Pair("GHR", "TDJ"),
        "LKK" to Pair("VRD", "SGJ"),
        "BRF" to Pair("VFV", "LNH"),
        "MRM" to Pair("GSQ", "JNJ"),
        "JFQ" to Pair("BDC", "KSN"),
        "THT" to Pair("PHL", "DCX"),
        "FGL" to Pair("RSV", "TRX"),
        "RMT" to Pair("HHR", "BKV"),
        "SHL" to Pair("LHT", "FBK"),
        "RVN" to Pair("MPF", "TGD"),
        "PMD" to Pair("MFL", "DMP"),
        "JVN" to Pair("CMC", "BJC"),
        "FVC" to Pair("LNP", "LPX"),
        "BDC" to Pair("PRS", "PRS"),
        "BCT" to Pair("LDD", "PVM"),
        "PBQ" to Pair("QDX", "BVT"),
        "XLB" to Pair("FBF", "THP"),
        "HQG" to Pair("RXL", "GKK"),
        "QXK" to Pair("BNJ", "GSM"),
        "BRG" to Pair("PVQ", "NKP"),
        "TCC" to Pair("BFV", "GHQ"),
        "TTC" to Pair("VLV", "CBB"),
        "QJV" to Pair("QGG", "FTF"),
        "BJC" to Pair("GCQ", "LJV"),
        "BNS" to Pair("SCX", "LGL"),
        "LQK" to Pair("XRL", "MSB"),
        "FBK" to Pair("CSQ", "RKK"),
        "TND" to Pair("FMN", "FVC"),
        "DHX" to Pair("TKX", "DGS"),
        "GKC" to Pair("JKS", "CPT"),
        "VHQ" to Pair("DQF", "LNQ"),
        "VKN" to Pair("BDC", "BDC"),
        "KQG" to Pair("FHJ", "QHN"),
        "KBG" to Pair("HVS", "HFS"),
        "DVA" to Pair("XXG", "PRR"),
        "RTP" to Pair("RCJ", "MVV"),
        "KMJ" to Pair("BFV", "GHQ"),
        "FJG" to Pair("FSJ", "MRM"),
        "KGH" to Pair("NVN", "JJD"),
        "TRC" to Pair("KLM", "DCJ"),
        "PNT" to Pair("XHX", "KGH"),
        "PVM" to Pair("VVB", "KFL"),
        "JQQ" to Pair("JFX", "VBP"),
        "QTL" to Pair("MBK", "DSL"),
        "NPC" to Pair("NBN", "BVS"),
        "XDZ" to Pair("PRR", "XXG"),
        "JTR" to Pair("LTL", "BBT"),
        "LPX" to Pair("NXJ", "BPT"),
        "BGT" to Pair("FHK", "TBC"),
        "FFK" to Pair("NML", "DPL"),
        "GRR" to Pair("RLM", "GJD"),
        "QBR" to Pair("BNM", "MXC"),
        "QFF" to Pair("HMS", "DHJ"),
        "GTT" to Pair("MSV", "LQD"),
        "STH" to Pair("GLX", "RXQ"),
        "DCX" to Pair("BCT", "XQT"),
        "KNT" to Pair("QQH", "FNT"),
        "FPF" to Pair("LSJ", "QNX"),
        "VDB" to Pair("TTM", "GNJ"),
        "GDQ" to Pair("VJJ", "BTV"),
        "XPK" to Pair("PFB", "SRN"),
        "CXC" to Pair("LMM", "JXT"),
        "MDJ" to Pair("MDL", "VHQ"),
        "NFL" to Pair("HSN", "PVN"),
        "KMT" to Pair("LFT", "SNP"),
        "KCT" to Pair("HKF", "LKK"),
        "TJC" to Pair("THT", "FPJ"),
        "FKC" to Pair("PLJ", "FDS"),
        "HGJ" to Pair("BKV", "HHR"),
        "QMN" to Pair("QQN", "HVG"),
        "HBT" to Pair("CSV", "JCB"),
        "QHN" to Pair("TGV", "VFR"),
        "QGG" to Pair("TCB", "FQH"),
        "NMT" to Pair("RFS", "MDB"),
        "BGF" to Pair("NFL", "LNF"),
        "TXJ" to Pair("NPC", "FGC"),
        "RQB" to Pair("XNP", "PQV"),
        "FHG" to Pair("TND", "HNN"),
        "DRL" to Pair("DCL", "JRT"),
        "CSN" to Pair("CVH", "BRL"),
        "MRK" to Pair("CRS", "HPQ"),
        "XPM" to Pair("GGS", "GGS"),
        "CTT" to Pair("PFB", "SRN"),
        "SMX" to Pair("PQB", "CRF"),
        "NVH" to Pair("BGF", "CPK"),
        "CGB" to Pair("GLX", "RXQ"),
        "HJV" to Pair("RVN", "FLF"),
        "TSM" to Pair("CRF", "PQB"),
        "HPQ" to Pair("STB", "MCK"),
        "JMD" to Pair("RMT", "HGJ"),
        "KPC" to Pair("JHF", "JNV"),
        "VLV" to Pair("MJX", "MCQ"),
        "RRK" to Pair("XGP", "LHL"),
        "MGH" to Pair("BVG", "GTT"),
        "XFD" to Pair("RKT", "TCN"),
        "JVB" to Pair("FQJ", "MGH"),
        "VNX" to Pair("KGH", "XHX"),
        "FNT" to Pair("NQJ", "XFP"),
        "XGP" to Pair("DCM", "CDK"),
        "GSR" to Pair("GRR", "FPH"),
        "NQJ" to Pair("QJG", "VCS"),
        "RJC" to Pair("CVH", "BRL"),
        "CLG" to Pair("DSB", "JLJ"),
        "FHK" to Pair("HJV", "TNX"),
        "XDD" to Pair("DPL", "NML"),
        "LKQ" to Pair("PQN", "VTS"),
        "VBM" to Pair("LVN", "FHF"),
        "RFT" to Pair("KFC", "BJN"),
        "JFT" to Pair("BNS", "HNX"),
        "JKS" to Pair("GCT", "XJV"),
        "LHL" to Pair("DCM", "CDK"),
        "RMG" to Pair("QDS", "QMR"),
        "VXA" to Pair("BRF", "XKN"),
        "SCT" to Pair("BJF", "TDL"),
        "HFG" to Pair("QTF", "HMG"),
        "JQL" to Pair("JVN", "HXT"),
        "FTB" to Pair("PJS", "VVS"),
        "DVG" to Pair("SSD", "PCL"),
        "JRT" to Pair("LDG", "JFT"),
        "RXK" to Pair("NNX", "FFX"),
        "DDM" to Pair("LQV", "MRK"),
        "DPG" to Pair("XDD", "FFK"),
        "GCQ" to Pair("CQL", "PSV"),
        "GQT" to Pair("NKS", "VDX"),
        "LMM" to Pair("BFQ", "VSM"),
        "PQF" to Pair("VDB", "GXH"),
        "GFD" to Pair("GCM", "LSF"),
        "KGC" to Pair("STH", "CGB"),
        "KDT" to Pair("SBV", "LDX"),
        "JHS" to Pair("BLN", "QTL"),
        "VBP" to Pair("CVT", "PBQ"),
        "PDL" to Pair("JPV", "PRF"),
        "HRV" to Pair("BXG", "RSN"),
        "XKN" to Pair("LNH", "VFV"),
        "FLT" to Pair("SVV", "RBM"),
        "TCN" to Pair("RBD", "BTB"),
        "BVG" to Pair("LQD", "MSV"),
        "LGL" to Pair("SGS", "CDR"),
        "DVX" to Pair("PFH", "VNJ"),
        "TRD" to Pair("SLB", "NBR"),
        "VFR" to Pair("KJR", "PVS"),
        "RFG" to Pair("BQF", "BTK"),
        "GGS" to Pair("FGD", "FGD"),
        "XPF" to Pair("KDD", "RLC"),
        "TGD" to Pair("XPM", "XXC"),
        "LKC" to Pair("FJH", "CHT"),
        "JMT" to Pair("LSL", "PTH"),
        "QQM" to Pair("KFC", "BJN"),
        "HBQ" to Pair("SRK", "XBQ"),
        "XVH" to Pair("VKN", "JFQ"),
        "BNH" to Pair("MLT", "HNC"),
        "DPL" to Pair("TJR", "LRH"),
        "KQB" to Pair("VNN", "SCT"),
        "LJV" to Pair("PSV", "CQL"),
        "JPV" to Pair("HQN", "FKC"),
        "HNC" to Pair("SHM", "KNT"),
        "FNJ" to Pair("XBJ", "GDF"),
        "NXG" to Pair("JNV", "JHF"),
        "PFK" to Pair("GTF", "VLD"),
        "FRP" to Pair("LSJ", "QNX"),
        "SDH" to Pair("STJ", "VKQ"),
        "RBK" to Pair("BLJ", "XMX"),
        "VJJ" to Pair("JMT", "CSK"),
        "FDX" to Pair("CXL", "QTB"),
        "FLF" to Pair("MPF", "TGD"),
        "FPH" to Pair("RLM", "GJD"),
        "TNX" to Pair("RVN", "FLF"),
        "PCL" to Pair("KVV", "KGT"),
        "TDX" to Pair("FBG", "BJT"),
        "HFD" to Pair("PHP", "FRZ"),
        "SVN" to Pair("TLT", "BCC"),
        "PFS" to Pair("XBV", "BRG"),
        "CSK" to Pair("LSL", "PTH"),
        "MQX" to Pair("LFJ", "MNX"),
        "PHP" to Pair("BXQ", "RTP"),
        "FVM" to Pair("FTF", "QGG"),
        "MNX" to Pair("HRV", "KFB"),
        "LNN" to Pair("BNJ", "GSM"),
        "XMX" to Pair("BLT", "HPL"),
        "XFP" to Pair("VCS", "QJG"),
        "KKF" to Pair("SMQ", "NTS"),
        "MRD" to Pair("FPJ", "THT"),
        "QDD" to Pair("KBG", "KQF"),
        "RTC" to Pair("CVK", "TCT"),
        "XXC" to Pair("GGS", "CDH"),
        "GJF" to Pair("BDR", "FCM"),
        "HRM" to Pair("NPQ", "HQM"),
        "LGC" to Pair("VLD", "GTF"),
        "FHJ" to Pair("VFR", "TGV"),
        "FXN" to Pair("RTK", "RTK"),
        "PSL" to Pair("MNX", "LFJ"),
        "SXR" to Pair("GLG", "NPT"),
        "BVS" to Pair("BKF", "NNH"),
        "JHA" to Pair("BXQ", "RTP"),
        "VFV" to Pair("SHB", "KVC"),
        "LQG" to Pair("SNH", "JPD"),
        "XQL" to Pair("SNP", "LFT"),
        "TDP" to Pair("LGM", "TQV"),
        "LTL" to Pair("KGC", "DMT"),
        "HML" to Pair("RBM", "SVV"),
        "TKX" to Pair("NKV", "GFD"),
        "BCM" to Pair("QHH", "CNP"),
        "RFD" to Pair("KQS", "CMN"),
        "MKS" to Pair("RJC", "CSN"),
        "LHZ" to Pair("KQF", "KBG"),
        "VSH" to Pair("HQG", "TJF"),
        "DPP" to Pair("VNH", "FDX"),
        "HRB" to Pair("SCT", "VNN"),
        "MRF" to Pair("QQM", "RFT"),
        "TGV" to Pair("PVS", "KJR"),
        "PFB" to Pair("DKS", "DPP"),
        "TCB" to Pair("QPG", "PQF"),
        "SXH" to Pair("DHB", "DHM"),
        "GHJ" to Pair("RSV", "TRX"),
        "LSF" to Pair("HDR", "DJJ"),
        "VVB" to Pair("GHJ", "FGL"),
        "JFX" to Pair("CVT", "PBQ"),
        "PXJ" to Pair("NXG", "KPC"),
        "SVT" to Pair("MMQ", "MMQ"),
        "VNH" to Pair("CXL", "QTB"),
        "MHN" to Pair("KDD", "RLC"),
        "FTF" to Pair("TCB", "FQH"),
        "DSL" to Pair("QMN", "JTP"),
        "FLL" to Pair("RTH", "PVT"),
        "QQJ" to Pair("FHF", "LVN"),
        "HSN" to Pair("QMV", "FHG"),
        "BXP" to Pair("DHN", "FMJ"),
        "KDD" to Pair("CNS", "MLM"),
        "JVJ" to Pair("HVB", "PKT"),
        "HQN" to Pair("FDS", "PLJ"),
        "KQS" to Pair("NQB", "JQL"),
        "MVG" to Pair("HKF", "LKK"),
        "KCK" to Pair("CSJ", "FNJ"),
        "CVK" to Pair("NFV", "VMQ"),
        "NKX" to Pair("FSJ", "MRM"),
        "HSJ" to Pair("RFG", "FML"),
        "RBD" to Pair("BMH", "KRL"),
        "MFL" to Pair("JNP", "HBT"),
        "SDJ" to Pair("PQN", "VTS"),
        "CDR" to Pair("QJV", "FVM"),
        "GPG" to Pair("KGL", "BGT"),
        "VNN" to Pair("BJF", "TDL"),
        "VLB" to Pair("JCQ", "TKJ"),
        "DXG" to Pair("BCM", "GMS"),
        "FKB" to Pair("PLS", "RGF"),
        "SVV" to Pair("GDQ", "QVS"),
        "VSV" to Pair("VKN", "JFQ"),
        "PRR" to Pair("MVX", "FHN"),
        "PTH" to Pair("PXN", "GJF"),
        "KFC" to Pair("LGC", "PFK"),
        "DMP" to Pair("HBT", "JNP"),
        "KGT" to Pair("GSJ", "NHK"),
        "HXX" to Pair("GKC", "LXQ"),
        "BDL" to Pair("NRQ", "DHX"),
        "SLB" to Pair("SCC", "SHL"),
        "NBR" to Pair("SCC", "SHL"),
        "GHR" to Pair("NBB", "GXF"),
        "PHT" to Pair("HDK", "KRF"),
        "GMM" to Pair("LQV", "MRK"),
        "MVV" to Pair("FPF", "FRP"),
        "QCJ" to Pair("FMJ", "DHN"),
        "LSL" to Pair("GJF", "PXN"),
        "GCT" to Pair("PLG", "TVL"),
        "FGD" to Pair("XXG", "PRR"),
        "DLD" to Pair("FKH", "NDR"),
        "VRD" to Pair("MQX", "PSL"),
        "NDJ" to Pair("TRC", "BSB"),
        "LCD" to Pair("JHN", "MGP"),
        "SRN" to Pair("DPP", "DKS"),
        "FRZ" to Pair("RTP", "BXQ"),
        "GSM" to Pair("FJD", "KCK"),
        "DCL" to Pair("LDG", "JFT"),
        "LVM" to Pair("CLV", "FDD"),
        "BTD" to Pair("PFS", "HDG"),
        "HVB" to Pair("SVT", "SVT"),
        "LDR" to Pair("HJK", "PDJ"),
        "TQV" to Pair("CQJ", "XJQ"),
        "JFZ" to Pair("SXH", "KGM"),
        "PLJ" to Pair("HXX", "JCR"),
        "JRX" to Pair("JMD", "GHF"),
        "DJJ" to Pair("LQG", "KFD"),
        "RPS" to Pair("RQB", "GSH"),
        "QPG" to Pair("GXH", "VDB"),
        "GJD" to Pair("FKB", "STD"),
        "SNK" to Pair("LGM", "TQV"),
        "LRR" to Pair("VGQ", "HKJ"),
        "MXH" to Pair("GNB", "FLL"),
        "MBR" to Pair("DTN", "XLB"),
        "XJX" to Pair("RTK", "FSV"),
        "BFV" to Pair("FXN", "FXN"),
        "XRL" to Pair("LCP", "HSJ"),
        "FDS" to Pair("HXX", "JCR"),
        "HHR" to Pair("TCC", "KMJ"),
        "GHF" to Pair("RMT", "HGJ"),
        "XLJ" to Pair("HMG", "QTF"),
        "JLM" to Pair("JFX", "VBP"),
        "GNJ" to Pair("DMQ", "BTD"),
        "KLM" to Pair("LJS", "DPG"),
        "JNV" to Pair("NVM", "GCL"),
        "QQN" to Pair("BMN", "DSK"),
        "FJS" to Pair("NNX", "FFX"),
        "GLG" to Pair("CLG", "GTX"),
        "ZZZ" to Pair("QHN", "FHJ"),
        "TRX" to Pair("QKR", "JLP"),
        "QPP" to Pair("DTQ", "JKV"),
        "XXX" to Pair("XPQ", "SKF"),
        "DHB" to Pair("HXD", "RPP"),
        "XXS" to Pair("QMR", "QDS"),
        "PLS" to Pair("NVH", "RJG"),
        "CRS" to Pair("STB", "STB"),
        "SKK" to Pair("VLV", "CBB"),
        "FHF" to Pair("FJS", "RXK"),
        "NFK" to Pair("SNM", "RDD"),
        "GXX" to Pair("LKC", "XPS"),
        "GLX" to Pair("HCT", "DFL"),
        "LNP" to Pair("BPT", "NXJ"),
        "RLX" to Pair("JRG", "HBQ"),
        "MSQ" to Pair("TRD", "MTP"),
        "KXN" to Pair("RPS", "KVD"),
        "JCB" to Pair("TPH", "QBR"),
        "JLJ" to Pair("MMG", "JRX"),
        "FHN" to Pair("RBK", "VSL"),
        "DSB" to Pair("MMG", "JRX"),
        "BTK" to Pair("RKQ", "LFK"),
        "VCS" to Pair("JDB", "BRX"),
        "SKF" to Pair("GRG", "DPR"),
        "PQN" to Pair("DFX", "NXN"),
        "MPF" to Pair("XPM", "XPM"),
        "CDH" to Pair("FGD", "XDZ"),
        "KRF" to Pair("SJJ", "SXR"),
        "HNX" to Pair("LGL", "SCX"),
        "TGH" to Pair("DTT", "RLX"),
        "FPJ" to Pair("PHL", "DCX"),
        "KFD" to Pair("JPD", "SNH"),
        "FJH" to Pair("GLQ", "RFD"),
        "LQV" to Pair("CRS", "HPQ"),
        "RXQ" to Pair("HCT", "DFL"),
        "TKJ" to Pair("NHV", "FGM"),
        "SCX" to Pair("CDR", "SGS"),
        "JLP" to Pair("KXN", "CMX"),
        "TJV" to Pair("VHQ", "MDL"),
        "DSK" to Pair("PDL", "GVC"),
        "QHH" to Pair("HLP", "NBV"),
        "NVM" to Pair("JDM", "NFK"),
        "NNH" to Pair("QPP", "XSG"),
        "VGQ" to Pair("PQT", "PMS"),
        "CNS" to Pair("XMQ", "PMD"),
        "LFJ" to Pair("KFB", "HRV"),
        "FMJ" to Pair("QFM", "PXJ"),
        "NRQ" to Pair("TKX", "DGS"),
        "HDD" to Pair("HVB", "PKT"),
        "JFN" to Pair("TKJ", "JCQ"),
        "XPS" to Pair("CHT", "FJH"),
        "SMQ" to Pair("KDT", "BDD"),
        "JQK" to Pair("HQM", "NPQ"),
        "RKQ" to Pair("GDB", "GMN"),
        "FCM" to Pair("KQB", "HRB"),
        "RLL" to Pair("BLN", "QTL"),
        "BLN" to Pair("MBK", "DSL"),
        "LJS" to Pair("XDD", "FFK"),
        "BVT" to Pair("XKT", "JTM"),
        "GNB" to Pair("RTH", "PVT"),
        "RFX" to Pair("BSB", "TRC"),
        "FVR" to Pair("MDJ", "TJV"),
        "SJJ" to Pair("NPT", "GLG"),
        "RKT" to Pair("RBD", "BTB"),
        "LVN" to Pair("RXK", "FJS"),
        "QDX" to Pair("XKT", "JTM"),
        "HVS" to Pair("HML", "FLT"),
        "QTB" to Pair("MRF", "NSM"),
        "XXG" to Pair("FHN", "MVX"),
        "BKF" to Pair("QPP", "XSG"),
        "CSQ" to Pair("KCP", "TGH"),
        "JVC" to Pair("DLD", "BHF"),
        "SCS" to Pair("MSL", "FTB"),
        "LDX" to Pair("PHT", "KKM"),
        "TTM" to Pair("BTD", "DMQ"),
        "VTS" to Pair("NXN", "DFX"),
        "PHL" to Pair("BCT", "XQT"),
        "RGM" to Pair("MQS", "DCD"),
        "FJT" to Pair("FGC", "NPC"),
        "DCD" to Pair("SCS", "FKS"),
        "BHF" to Pair("NDR", "FKH"),
        "FGC" to Pair("BVS", "NBN"),
        "HMG" to Pair("LQK", "QKN"),
        "KFV" to Pair("RLF", "TKN"),
        "RPP" to Pair("GSR", "VVM"),
        "LFK" to Pair("GDB", "GMN"),
        "QKR" to Pair("CMX", "KXN"),
        "NNX" to Pair("DGH", "DCB"),
        "KVC" to Pair("LKQ", "SDJ"),
        "MSB" to Pair("LCP", "HSJ"),
        "XGN" to Pair("HQG", "TJF"),
        "CMX" to Pair("KVD", "RPS"),
        "DFL" to Pair("FJT", "TXJ"),
        "QQH" to Pair("NQJ", "XFP"),
        "HCT" to Pair("TXJ", "FJT"),
        "HKJ" to Pair("PMS", "PQT"),
        "LDG" to Pair("HNX", "BNS"),
        "RTH" to Pair("HKG", "LCD"),
        "NXJ" to Pair("RFX", "NDJ"),
        "RBM" to Pair("GDQ", "QVS"),
        "RKK" to Pair("TGH", "KCP"),
        "MQS" to Pair("FKS", "SCS"),
        "VVN" to Pair("XPK", "CTT"),
        "XSG" to Pair("DTQ", "JKV"),
        "TKN" to Pair("CKJ", "CKH"),
        "CHT" to Pair("GLQ", "RFD"),
        "PXN" to Pair("BDR", "FCM"),
        "LCP" to Pair("FML", "RFG"),
        "PFH" to Pair("JTR", "HBN"),
        "TLT" to Pair("STM", "JVB"),
        "GSP" to Pair("XGN", "VSH"),
        "MMG" to Pair("GHF", "JMD"),
        "CVT" to Pair("BVT", "QDX"),
        "HXS" to Pair("CXC", "MDR"),
        "PVN" to Pair("FHG", "QMV"),
        "PVS" to Pair("MRD", "TJC"),
        "XKT" to Pair("KFV", "PPN"),
        "RFS" to Pair("LDR", "KJK"),
        "NKV" to Pair("GCM", "LSF"),
        "XQX" to Pair("BHF", "DLD"),
        "VDX" to Pair("HCQ", "MXH"),
        "DGS" to Pair("NKV", "GFD"),
        "KGM" to Pair("DHB", "DHM"),
        "GFC" to Pair("PCL", "SSD"),
        "PDJ" to Pair("FMB", "MHL"),
        "GSJ" to Pair("XXX", "PQX"),
        "STM" to Pair("MGH", "FQJ"),
        "MCK" to Pair("KVP", "JGG"),
        "KGF" to Pair("BGT", "KGL"),
        "PRF" to Pair("HQN", "FKC"),
        "GKK" to Pair("MJL", "XFS"),
        "HDG" to Pair("XBV", "BRG"),
        "XJQ" to Pair("BXP", "QCJ"),
        "JTP" to Pair("QQN", "HVG"),
        "DFX" to Pair("JFN", "VLB"),
        "FBN" to Pair("XVH", "VSV"),
        "CMC" to Pair("GCQ", "LJV"),
        "BQF" to Pair("LFK", "RKQ"),
        "CKH" to Pair("DRB", "XLQ"),
        "XJV" to Pair("PLG", "TVL"),
        "VQH" to Pair("HSX", "BBL"),
        "JJD" to Pair("XFD", "QQR"),
        "GVC" to Pair("JPV", "PRF"),
        "KFL" to Pair("GHJ", "FGL"),
        "SHB" to Pair("LKQ", "SDJ"),
        "NPT" to Pair("CLG", "GTX"),
        "XNP" to Pair("VNX", "PNT"),
        "LDD" to Pair("VVB", "KFL"),
        "GFS" to Pair("DTN", "XLB"),
        "MDR" to Pair("LMM", "JXT"),
        "SSD" to Pair("KVV", "KGT"),
        "THP" to Pair("MHN", "XPF"),
        "BTB" to Pair("BMH", "KRL"),
        "PJS" to Pair("DVG", "GFC"),
        "LHT" to Pair("RKK", "CSQ"),
        "QVH" to Pair("KGM", "SXH"),
        "SRK" to Pair("DKF", "JRP"),
        "GTX" to Pair("JLJ", "DSB"),
        "BRL" to Pair("SDH", "KSQ"),
        "CXL" to Pair("MRF", "NSM"),
        "CSJ" to Pair("GDF", "XBJ"),
        "TBC" to Pair("HJV", "TNX"),
        "TVL" to Pair("MPQ", "TDX"),
        "STD" to Pair("PLS", "RGF"),
        "CSV" to Pair("QBR", "TPH"),
        "GCL" to Pair("NFK", "JDM"),
        "FMD" to Pair("FDD", "CLV"),
        "TDL" to Pair("SNK", "TDP"),
        "FQM" to Pair("QVH", "JFZ"),
        "RNK" to Pair("JVC", "XQX"),
        "KSN" to Pair("PRS", "FQM"),
        "MPQ" to Pair("FBG", "FBG"),
        "HVG" to Pair("BMN", "DSK"),
        "RJG" to Pair("BGF", "CPK"),
        "GTF" to Pair("RLL", "JHS"),
        "SKM" to Pair("MMQ", "HFD"),
        "DFT" to Pair("TJV", "MDJ"),
        "CBB" to Pair("MCQ", "MJX"),
        "FKH" to Pair("RGL", "MSQ"),
        "HKF" to Pair("SGJ", "VRD"),
        "QJG" to Pair("BRX", "JDB"),
        "LNQ" to Pair("VVN", "HLJ"),
        "LRH" to Pair("XXS", "RMG"),
        "DGH" to Pair("KGF", "GPG"),
        "GMS" to Pair("CNP", "QHH"),
        "GMN" to Pair("DSN", "GQT"),
        "DHJ" to Pair("NKX", "FJG"),
        "DTN" to Pair("FBF", "THP"),
        "KCP" to Pair("RLX", "DTT"),
        "SLN" to Pair("XGP", "LHL"),
        "PSV" to Pair("FBN", "BDX"),
        "XBJ" to Pair("VBM", "QQJ"),
        "XMQ" to Pair("MFL", "DMP"),
        "KVV" to Pair("GSJ", "NHK"),
        "BNJ" to Pair("FJD", "KCK"),
        "HDK" to Pair("SJJ", "SXR"),
        "VMQ" to Pair("MVG", "KCT"),
        "MGP" to Pair("FHV", "DVX"),
        "BLT" to Pair("NMM", "BNH"),
        "DCB" to Pair("GPG", "KGF"),
        "BMN" to Pair("PDL", "GVC"),
        "DKS" to Pair("FDX", "VNH"),
        "CRF" to Pair("XLJ", "HFG"),
        "BDD" to Pair("LDX", "SBV"),
        "XBQ" to Pair("DKF", "JRP"),
        "CNP" to Pair("HLP", "NBV"),
        "DCJ" to Pair("DPG", "LJS"),
        "QMR" to Pair("SKK", "TTC"),
        "LFT" to Pair("NVV", "SSH"),
        "RVQ" to Pair("MDB", "RFS"),
        "HVN" to Pair("CSN", "RJC"),
        "CTQ" to Pair("GSL", "RTC"),
        "MJX" to Pair("QFF", "JVS"),
        "KKM" to Pair("KRF", "HDK"),
        "RGL" to Pair("MTP", "TRD"),
        "HSX" to Pair("LVM", "FMD"),
        "FMN" to Pair("LNP", "LPX"),
        "TJR" to Pair("RMG", "XXS"),
        "JCQ" to Pair("NHV", "FGM"),
        "QKN" to Pair("MSB", "XRL"),
        "MDB" to Pair("KJK", "LDR"),
        "JNP" to Pair("JCB", "CSV"),
        "BJT" to Pair("KQG", "ZZZ"),
        "RLF" to Pair("CKJ", "CKH"),
        "JVS" to Pair("DHJ", "HMS"),
        "NTM" to Pair("GMS", "BCM"),
        "BMH" to Pair("RGM", "RSP"),
        "HDR" to Pair("LQG", "KFD"),
        "GSQ" to Pair("TLQ", "CTQ"),
        "NKS" to Pair("HCQ", "MXH"),
        "FBG" to Pair("KQG", "KQG"),
        "QMB" to Pair("SMQ", "NTS"),
        "KJK" to Pair("PDJ", "HJK"),
        "FHV" to Pair("VNJ", "PFH"),
        "JDM" to Pair("SNM", "RDD"),
        "SSH" to Pair("RRK", "SLN"),
        "NVV" to Pair("SLN", "RRK"),
        "SGJ" to Pair("PSL", "MQX"),
        "SHM" to Pair("QQH", "FNT"),
        "JTM" to Pair("KFV", "PPN"),
        "DKF" to Pair("MRC", "HTG"),
        "MSL" to Pair("PJS", "VVS"),
        "BSB" to Pair("DCJ", "KLM"),
        "PLG" to Pair("MPQ", "MPQ"),
        "FKS" to Pair("FTB", "MSL"),
        "GXH" to Pair("GNJ", "TTM"),
        "NML" to Pair("TJR", "LRH"),
        "SBV" to Pair("PHT", "KKM"),
        "BRX" to Pair("XQJ", "RNK"),
        "FML" to Pair("BTK", "BQF"),
        "GCM" to Pair("DJJ", "HDR"),
        "XBV" to Pair("NKP", "PVQ"),
        "JHF" to Pair("GCL", "NVM"),
        "BFQ" to Pair("JQK", "HRM"),
        "NPQ" to Pair("TDR", "GSP"),
        "RSP" to Pair("DCD", "MQS"),
        "DPR" to Pair("RVQ", "NMT"),
        "DMT" to Pair("CGB", "STH"),
        "SNM" to Pair("TDJ", "GHR"),
        "XLQ" to Pair("MKS", "HVN"),
        "GRG" to Pair("RVQ", "NMT"),
        "JHN" to Pair("FHV", "DVX"),
        "PKT" to Pair("SVT", "SKM"),
        "KVD" to Pair("RQB", "GSH"),
        "TCT" to Pair("NFV", "VMQ"),
        "RTK" to Pair("QGP", "QGP"),
        "FQH" to Pair("PQF", "QPG"),
        "HXD" to Pair("VVM", "GSR"),
        "PPN" to Pair("RLF", "TKN"),
        "MTP" to Pair("NBR", "SLB"),
        "JXT" to Pair("BFQ", "VSM"),
        "PQV" to Pair("VNX", "PNT"),
        "TJF" to Pair("RXL", "GKK"),
        "NMM" to Pair("MLT", "HNC"),
        "TDJ" to Pair("GXF", "NBB"),
        "QFM" to Pair("NXG", "KPC"),
        "MXC" to Pair("BNK", "BDL"),
        "XPQ" to Pair("GRG", "DPR"),
        "VVM" to Pair("GRR", "FPH"),
        "BXG" to Pair("GXX", "HHG"),
        "PVT" to Pair("LCD", "HKG"),
        "LSJ" to Pair("NTM", "DXG"),
        "BJF" to Pair("SNK", "TDP"),
        "VNJ" to Pair("HBN", "JTR"),
        "TDR" to Pair("XGN", "VSH"),
        "NXN" to Pair("VLB", "JFN"),
        "NKP" to Pair("XQL", "KMT"),
        "MCQ" to Pair("QFF", "JVS"),
        "HJK" to Pair("MHL", "FMB"),
        "BLJ" to Pair("HPL", "BLT"),
        "SNP" to Pair("NVV", "SSH"),
        "RCJ" to Pair("FPF", "FRP"),
        "XQJ" to Pair("JVC", "XQX"),
        "CPT" to Pair("GCT", "XJV"),
        "BCC" to Pair("JVB", "STM"),
        "FSV" to Pair("QGP", "TNZ"),
        "CMN" to Pair("JQL", "NQB"),
        "RLM" to Pair("STD", "FKB"),
        "STB" to Pair("KVP", "KVP"),
        "JDB" to Pair("RNK", "XQJ"),
        "VSM" to Pair("JQK", "HRM"),
        "JPD" to Pair("HXS", "HCC"),
        "BTV" to Pair("JMT", "CSK"),
        "DHN" to Pair("PXJ", "QFM"),
        "CQJ" to Pair("BXP", "QCJ"),
        "MLT" to Pair("KNT", "SHM"),
        "DMQ" to Pair("PFS", "HDG"),
        "MBK" to Pair("QMN", "JTP"),
        "NTS" to Pair("KDT", "BDD"),
        "SCC" to Pair("FBK", "LHT"),
        "HHG" to Pair("LKC", "XPS"),
        "PRS" to Pair("QVH", "QVH"),
        "TLQ" to Pair("RTC", "GSL"),
        "BJN" to Pair("LGC", "PFK"),
        "FBF" to Pair("MHN", "XPF"),
        "VKQ" to Pair("LRR", "LXJ"),
        "PQX" to Pair("XPQ", "SKF"),
        "TNZ" to Pair("XKN", "BRF"),
        "FJD" to Pair("FNJ", "CSJ"),
        "JNJ" to Pair("CTQ", "TLQ"),
        "HTG" to Pair("LNN", "QXK"),
        "GHH" to Pair("HSX", "BBL"),
        "BDX" to Pair("XVH", "VSV"),
        "NBV" to Pair("TSM", "SMX"),
        "LNH" to Pair("SHB", "KVC"),
        "GLQ" to Pair("CMN", "KQS"),
        "CKJ" to Pair("XLQ", "DRB"),
        "HFS" to Pair("HML", "FLT"),
        "STJ" to Pair("LXJ", "LRR"),
        "QVS" to Pair("VJJ", "BTV"),
        "HCQ" to Pair("GNB", "FLL"),
        "RHM" to Pair("TLT", "BCC"),
        "MRC" to Pair("LNN", "QXK"),
        "DSN" to Pair("VDX", "NKS"),
        "HCC" to Pair("CXC", "MDR"),
        "FFX" to Pair("DCB", "DGH"),
        "HPL" to Pair("NMM", "BNH"),
        "DHM" to Pair("RPP", "HXD"),
        "LXQ" to Pair("CPT", "JKS"),
        "RLC" to Pair("MLM", "CNS"),
        "BBT" to Pair("DMT", "KGC"),
        "PQT" to Pair("VQH", "GHH"),
        "BKV" to Pair("TCC", "KMJ"),
        "KGL" to Pair("FHK", "TBC"),
        "VLD" to Pair("JHS", "RLL"),
        "DTQ" to Pair("MMK", "DRL"),
        "HKG" to Pair("MGP", "JHN"),
        "JKV" to Pair("DRL", "MMK"),
        "CVH" to Pair("KSQ", "SDH"),
        "QQR" to Pair("RKT", "TCN"),
        "JGG" to Pair("QDD", "LHZ"),
        "FSJ" to Pair("GSQ", "JNJ"),
        "LXJ" to Pair("VGQ", "HKJ"),
        "BPT" to Pair("NDJ", "RFX"),
        "QGP" to Pair("BRF", "XKN"),
        "JCR" to Pair("LXQ", "GKC"),
        "DRB" to Pair("MKS", "HVN"),
        "LQD" to Pair("DFT", "FVR"),
        "VVS" to Pair("GFC", "DVG"),
        "FQJ" to Pair("BVG", "GTT"),
        "XHX" to Pair("JJD", "NVN"),
        "MLM" to Pair("XMQ", "PMD"),
        "QDS" to Pair("TTC", "SKK"),
        "NMA" to Pair("KGM", "SXH"),
        "HBN" to Pair("BBT", "LTL"),
        "KQF" to Pair("HFS", "HVS"),
        "PVQ" to Pair("XQL", "KMT"),
        "CLV" to Pair("DDM", "GMM"),
        "BXQ" to Pair("RCJ", "MVV"),
        "GHQ" to Pair("FXN", "XJX"),
        "RSN" to Pair("HHG", "GXX"),
        "SGS" to Pair("QJV", "FVM"),
        "PQB" to Pair("XLJ", "HFG"),
        "MMK" to Pair("DCL", "JRT"),
        "JRG" to Pair("SRK", "XBQ"),
        "HXT" to Pair("BJC", "CMC"),
        "GSH" to Pair("XNP", "PQV"),
        "BNK" to Pair("DHX", "NRQ"),
        "HQM" to Pair("GSP", "TDR"),
        "BNM" to Pair("BNK", "BDL"),
        "CPK" to Pair("LNF", "NFL"),
        "JRP" to Pair("HTG", "MRC"),
        "NHV" to Pair("GFS", "MBR"),
        "NQB" to Pair("HXT", "JVN"),
        "HLP" to Pair("SMX", "TSM"),
        "PXA" to Pair("KBG", "KQF")
    )
    println(findCommonDirection(direction, maps))
}