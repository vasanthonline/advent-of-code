

fun findSum(input: Array<String>): Int {
    val numWords = listOf<String>("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    return input.sumOf { str ->
        val firstWordOccurrence = str.findAnyOf(numWords, 0, true)
        val firstNumOccurrence = str.indexOfFirst { char -> char.isDigit() }
        val lastWordOccurrence = str.findLastAnyOf(numWords, str.length, true)
        val lastNumOccurrence = str.indexOfLast { char -> char.isDigit() }

        val firstChar: Int = when {
            firstWordOccurrence == null && firstNumOccurrence >= 0 -> str[firstNumOccurrence].digitToInt()
            firstWordOccurrence != null && firstNumOccurrence == -1 -> numWords.indexOf(firstWordOccurrence.second) + 1
            firstNumOccurrence < (firstWordOccurrence?.first ?: -1) -> str[firstNumOccurrence].digitToInt()
            else -> numWords.indexOf(firstWordOccurrence?.second) + 1
        }
        val lastChar: Int = when {
            lastWordOccurrence == null && lastNumOccurrence >= 0 -> str[lastNumOccurrence].digitToInt()
            lastWordOccurrence != null && lastNumOccurrence == -1 -> numWords.indexOf(lastWordOccurrence.second) + 1
            lastNumOccurrence > (lastWordOccurrence?.first ?: -1) -> str[lastNumOccurrence].digitToInt()
            else -> numWords.indexOf(lastWordOccurrence?.second) + 1
        }
        firstChar * 10 + lastChar
    }
}

fun main() {
    val input = arrayOf("dqfournine5four2jmlqcgv","7ggzdnjxndfive","twofive4threenine","dttwonezbgmcseven5seven","5vsrcnine","95zzbjck","gkoneight4fivekvktltnine","fiverckdmgbfthjdqpmpgdkmcklqtqc365mqtwo","44sevenhvstcbgkhm5foureight11","dprrtrngrfccz4eight4two8sthmfive","6twofive4seven7nine","four1sevenbfbnqvkbfoursix7","12xpdghpeightqvztrsslgsix5smlgfjhcpst","8dhzdtbeightfour3","pttdtmhg4","6eightsevendbtbxnqzxds6","twothree5nxglqlc9","nine6lqhnvbpxoneseveneightsxjfkz4vr","three28jxdmlqfmc619eightwol","26jtdpgqjzshncxvlljfour","qxvpsctgx1","28286qdjjlgtdtnsm3hk","9hcj6nine","nineseven9sqtrpfour","one1eight4sixzltzrkthree","threevlgfxhnf6seven6nine68","sixonesxxbxvfnkt8","8fivefivefour7sxsrvdrz","oneone7","ndtkjbsix6three9gdsjlljtj6six","cfmrfgjqgrzcmsix5","3threefour62three3vrmnmgx","kckdghseventwo1758","mdbqqjmpvonetwo1six31fourntbfb","lkjhjdthree3","qthseven61mpfnnhm6fivecnhz2","twojrfgzjstjvlngnpqcj8grtnvxmzbxkfrvqmvnmvmbdr","sloneightkqbgcpnv8kqcmzfouronesevenmrfjeight","xdxdxg9seventwo8xcq1","dpdgxzk7","18six3twoone","1twoseven3five","46tkbclbkleight64","tjprpjbshr2seven1pgfqmbmjlvsv","3mbjccssjgtdttvbdhdfxvldpmhcpc","lgfrkpsfvz5ppgqphtwoznjtgxdjpm3","mjmlsevenggsbjbtsix9nineone","jqfqjqhthreenine7eightklkttdkbtmpp1","trptrkbone52eight6","onetmvsrjlbqlninesix8","rone9ktvdqkdgl1","twosix5sixgrfdft54klf4","thrmone3eightsixfive","three4one","ppthg2three1one","7vt426","22foureight6","fourxbhmone56seven8eightnine","vhmsd171rgkhpgfhffnhkvt","xgbzxszsgtthree4","rclzfsn5twoeight","989nine2seven","eighteight5fivensix8","dfxzz5qcqzsjsg","d3eight54","5knflhntzthreeseventwo","threeonefour9oneninebsfpq","hjhgtjgtwotrsffive8hfntm","sixpmhzqrlkrthreefour1pcgvz96","5three31xqcsshkkqtfblffcmcntfour","zghcfvjsfz29nine","3vvvrlrjdztlhqqm88","39nine3seven93","1fqsgnjzrl6lrzsczc","threepldztlnvnzdntqllpr19","ninekgqqrgttfntrhjzlvninelr3","94eighteighteight","two13txmtlqxskhltkrvbjrzm97five","dbmjvszjtb17","twogpfttmhp8two13","four4bqzqscdbctssgxfzjjntwonfcktjrtnxskjpkhvlfjt","ctxxvdsvsvjzchmxvxceightthreembnlg5ninevmcbgsvbh","fpbrpfourqmrfcnpvxg8onehkbbgbsnnt","4zrrgsevenfour","6eight9foureightxlgdn","693rzcnvlfrv","bcftntcfl4jxbccpcmjeightcrxsjscmxdeightmhqbnpdvcfour","six83","xl4","njslckcbdfvkmkdk9eight","ninenineeight4nine","jkzvq3fourzzvdzdft","bfqpb9","eight6nlzdskjfourbmdvcrcgrshbjcxfour2","7zhlxtqtbjxqbszdtwonineeightjcl9","fvcjzxd5sevenfivefqnvkjthreeseven","3cxmpzkng3","8x2","nineeightsevenfourpfzzflnp97","2lkjpfhnpn7gbtztgxtnmclzdtdh33eightstbfrvxqz","nv8","3one7eight","ninetwortwoeightfive8ls","shncxrjqnjttvvzvnl6","ninethree963","mjcfrzjhr33csjxrtmm","five17","84bdfnptmffourfbqslsqeight","onegrzpdj8three2one6fsk","eight33gxpcqvpmeightk","6fbsfclhninetqj5twobxcz","119sixnjmxmvv","825bhceightone4jjdbvrzt2","xjchvkxxhg3sevensixseven3kmgqfmbgmbjnrq","l2","36hcmfnbmsevenfivetxhhgjdlq1khkk","eightj47five4sqtwo","6nineeight9","g2drvxqvpnbjfqxhl","vglkfour9rlmhsnine","onefivezr6rrtddnrg","3threellcbhjhjzqfive5","ggbmhzkcone2","23nclcqvjdzqcrpvsmnpzsfg3five","two5eightddxqgpm8twoseven","nrvtvlhrlr3tvpck1ghbvzxhjkneightgzxgtcddk","7lsxfjhqz","28four","mninetwo3","1fourfxqjpggbpb9threelj","seven3pzkfbqdstdgkrskqrlbg7fzfour4n","btctmct9three6threegkqqkcskfs8chvmcl","threefourskdp6twob","7three6five6eight3","5spkb6","34msnt","5bkqbzpgmjzeight","7g2onefour29fourfour","9fgsixzkbscvbxdsfive6spjfhzxbzvgbvrthreeoneightn","rpbd255fournine","277five","eightseven7sevenllninefive","rpjcmzkthbvdflbhxxkpv3oneplglgmv","xqktwone5jkpxvnptjeight","67one","cgxfhzsnrsjp3kjgzrlbhzh","fiveqqjljzfcmbfqvkscpzscpseven4nine1xvjlgk","tflkxnml5vptclnhkgdg11c2seven","sixeighttdbczshg82threepmjnxrvcnine6","nineone81mkltdkfgxtsevenfive","8zgx","cvb4kv22gp","61bjllhkblllqx8bmr5threesix","9cjfgb1bxncrgfhtmg973","eightninefour5twosixbsvnsndhtghtmfive","seven1bbfrvdcsthree2","cfzd8hvqscjxqf9","sixvfkcgmvqn9vmbzccdmqqgxmfxmnqc95","qqrqnd8twofive7czxtjnmxx","threebdmrlnxnlmdbzbv4","nm91vblgfourtsjp6","six96","sevenrjvbxptl9onecrlz","dvdbrmchgpninenine4onedjcfoneninetwo","hcrrgnlxftwo6four","threehcrfknsnqmg49","2tqbrkxgtdztjkdcnsix6three","mktnzjn58qspzpqdr7","dphvck5fourbmfnskkh72five78","one7seven7","bmpnljsxhfmtwozrhvdv8sjsrmnzlcjvjqcfgffhkjcbx","7one6874","three9tfx4","eight9pqhseightndgbv6","39jgmbzrzkctsix","1676","8xtpdhzfd8three44four8two","sixkvlppxqktkdqjsgjgz5","twoonehbgsdhpxkdvnpr3ncrgbqzfvsbcdsix4","39kpdxsp368seven2","xfljqfbz5tzpldspxvgc","fourqb6twocfljflzqqd","5889cxvxkstlld75rnlgzpgmhcmnx","84zxqsqvb","fiveksvtbqz9934","onefour96four78fourkbkhdhg","h61three2v","nine9jlbrfmgjv2kkfive","bjhktrjmfninexxnjhrvq7","fbcxlvgkkjcmpdcz7","mnleight3oneqqttlp","eighttwolffour1","onetqfghfourbmf5","four1qfive4","9fvp","cxxn5qzcm","one7hzjpnvhtdq","pxmht4fprcftwofive7gsixcqbmrd","three9fivesixrdqrhcqrqbl","6fggvr","ninesixmxvdcqgxcmskl115lskkp","sevenqkmqxltfive191lfbtfvzsixseven","ninemjnjgrlmnlseven5eight9","fhjjtxzksseven7fourthree","rfjksvfour26vqbdrbxc","6zgkfive8mhgxbsm","1njpjv696","4lrthsevendnsmseven","l4hxvjvlfpjmdbvdjzrhkhpmklnine7fourfour","2qtkhnineeightone","fivexhrxrzxht1foursix","sixlzcgllrqlhghzn1hdhgltcntfivefourfive1","dpkzdbzsgq9threecst7znsjgdmmhx1","three497lp388","llnklrkfr3","ltkkv481pzhqzkmhskxlznineninekcbrphlp","fivetwoseven71nineljsbc49","bvqsxnkpmzsevenhdpvfvlb2eight2bdxp3","onefour64","8xfdtfnqvhzkhvszeight5","threethree4two","z5two2fp","fourvjmcghrcfoureight3","lhztwo9dzhpdgn675","jnine4two49sixskv","9phbnnsoneqtpvvzbx5xzc","mtjfxzzhzdjvfmrc1","4ccszl3fiveseven55lfmktz","five27three9mgrnjcsbpd","6eight115five4c","two63fjlkgninepthmone","22ddxpbbpdseven","zg7","five3gvbthree6hjseven","x6six58nine","seveneighteight75three9two9","onevlpdgsnl3","sevenmbvqmjhfnzmgsqp8qnskjzptpppbcfhck2","7bpldrqr6fourpsntqbcqhfive","twothvddvmlbqknrj9pgpsjndbrmrgkgf","sixthree38onefoureightmvdtnn","vkqcnfkkc6","sixeight9","65fouronemklfgqbpgnvlvcvhjcdkq","three5five","981gxpsgqxjktwogninezgnf","cfnnzfnlmfqtwofour8fourxg5","45mpgbgzctwoqlsxmgs8","5nhzlcb6four6pzjjlr4ninej","gnkoneightprhlrseven7","1rzsq1seven3eight","sixnine9eight8eight","lcszz858","pdgbgjxthreethree3threeonengk","8zpzpttrqtwoninek895","634jgvbvr","nine8mvr","5seven2psmtnmzdfivesix","56ninerqrlzqvszrght6zkgtvrphpnvthree","5fiveone","43three","9mdtghvfjdqqbrmeightfour92tlstxvrhthree","b8","ninehpnmdhjqjl5ppptrd","41fournineeightvxxjdthreeeight","ntwonefnsdpnine8sevenbjzxpfive","6oneclxflmxvtwo1","9jbpfnvfsjblmxrprml5","68five7sfgxjqxrcjmninerzgxnhjpzkdhxzbg","1vztdlnone2lhrhx","6lrmdrxqlsttwovsr9eightpbmqcxn","2zjchhdbzhc","tsgntwomdtsjtdrthree9","7threethreedprbrvngxpfour","fivestvv3six","6one9sjlzjtxxnkbckdmc","zxqzmcz3eight","lndh86xphvbnine","fivesix3sixf93hbbptwo","3cxpbl","gsnqeight8kthxzrdkskjkmcmsknine5","67twoxdqninefour","fivefivehtczfmrhvlsevensevennbjkvhz84","cmbgm3eightpbmgjhsp2","fivepdhtcpvg3ninenlhpgdlnnine6fblsmlz","kcnsfsfhjbcffctznvp1","qzrkvhcds4gklftv","xslgkktct7snbxnplbk3five","zspb1sevennine76one","twonxtngxlrftltqggpftj3eight1gsrkbbclll","474jxtncx","bxsqsb8","svsvvtzddklkrxmpd2","xbvjfmcnine2znbqn5eight2smvkgpclvs6","tnlpfivem7","7seveneight2dfiveonesix6","fspcrlcthreej1seven4","7nineeight3hzfour","9fivethree","four5ggbseven","5hsv","1ppkkkhfzn","pkfzkpv9mtktjvrssdftslonebpmhf","8fhfqmzseven","six89htmnpmqsixzvxl","9mbkcbnmptpkhqvvzxftss7","48five","eight8118four7qsjb","cpghtgncpkkxtrvrsgl81eightcfzsjfq6","ninecsthl8onefgpmc","3threehnrone5dzcfdtpf2hdlnrxnmnhjqqqn","5ninesix54","lnzhtwo9446onefivefour","8two427bvcdkckdgz8","6six35seven","six2fcpzhbn6fivekm34","httmgldjfqnnhktmnhj4dsmffzknbq674","9nxrtsmqbcrgghqtx6kdnrfjq","thhmbpjldslpthkfxcfive1zrjqtpvjs8","cjtbcn7five9nlpgsoneone8","seven6eightx176ffrvml8","eight9jntmr4sevenmzjb","mxk51gt","three21foursevendbvm","zqtdz1ninemmhkjfiveeight","98xlpkzb","34two5four2cvtcjfdh","jvndgrtjonethree6","ninefivefive1lfqjqmptxvthree","kkxfqqkf49","3sixseven3dzpvnvt51rnzljdprb","hpzpdrnkthreekct1mqdvljhrls3","six6sjsljgvgzhrzqpsznh3fivejpxsvqccrc","cpvlr7","tdgthree8twofivexxrvct","62sixmt9ninefour","ninesevenfourzfzl43qssqrkktpnzjv","8mfztzthreeldnjgsfseven","356","6vrlthreer9sone6","sixs8six5sevenvnkgbmxj2two","8eightpglsknpxmsixjgqcftmvprjlcdsfks","3dlkbc1","five5eight1","7seven49","ggoneeightgcfnfkgbmlfourdls23","seven6jdpxxkfone","lfive715","2ninefivej2sixeight","ttwonethreethreesixzbqz7","zmbqqcd8ztp46567","nineeight11","zhgsixthreejffqhzdfvfxjpfmjqqkm36one","5vgftjvqkxj6pnctdcrktwoneq","9ptmkf8six","lbjxvnfiverjppbtrhf6xbdnsltlnrqsgmx8q","365pxj63gshpg","vlq5zhgj4","98hc13nnrzfzschg64","2twopq76kpmjdjflkqzxlvjhr","rnvmblqhq1","8j273qfpfkz","dsevenvvdmxhhcd1dkz","lkqhrxkmp96fppvsdtwombkfour","3one7dzpbhsrdf5","159ckggpfzlgntfrddvfiveeightthree9eightwodnp","eightseventhreeseven1","mrzpk8","fmvxth2eight8hjmfkdxjh","3threeone","nine5sixsixnzlqhsc","xtxbgtntwosixfour85","3eighthz4twoqmlhrzsevenkcqhgrghrd","12ldchpqzm","zcfjz5sixmqqmfsv9six6","sixlzcdtd3qlcjqzrtthnine","1one6nine","11xqblttcrdvgb7mdqkphrbdx","xbcc4mtgf5","sevenfourmthree1hgpnmvcvgshzvcsjdbqqgmt","v5xmghdgbkvnine","29mkpfz7","jptwo4lqlrh2onefive7jhcngr","four6twosixsthjqpgh2","pctrvkmc82four2958","12eight3","7jbqeightlbbnpsvvdfrqccb","peightwo6sevenfoursixdmchsd1","53dhphzvhnknt65ninefive","86fivegpnhl","tpcspvvncglcsqjzlqrfivejgfl8zspdltrd7","mhpskcvhn3bkjlmqd","onetwo4lxmsnddzfbxcdcscjxxrzsvvzg3nvtrpncvpmc","fprqq1bpqxvjmblc17","four7ninenineksjcktcbtzsmrfr","3nineccrnhtgg2knczqnnineoneqsgm","4xnkljmg7lmfvrhxm96","five458eighteightxcgrnine","klrzfbrpkmtptdscktmcsqg5xonesix","vtmh1glhzlkmrlgfourpsbhtbrvdz57one","9eight53threethreepgnc","fourseven3fivefq57","5sixsixthreegdsrhkhdlk3six","v9xqhpzkfivebnjslbzh548","jssdslcxxv3sdhbqnine5sixeight2","vr1","eightsoneqrrqfoursixzngsths9three","ltwoltrplmlkzz5sssjmzgcjsixfivejhms","49one","2sevenfivethlgxmxssnvlsfst4","8slfnfsfk","fourszbtpvvlvppsqbsprthreexgrlp3zt4","seveneight8rhonectrmxrjvnnthreetxmfbvxtlt9","twofive6eight9","zqxpxlzjm3hmzjzgoneeight1seventwo","9xbmqqtkstflg6onem2tdfsfjnxdmmzlrcnpm","pgcxbqvvj6","xfsix893","7four1","63five","tr9chvmlhhv6","jxc2six452","11zvz","oneqkhstmkhb11fourninezs37","3mxf3slhhs","sixgdnljsfkfnffp67789nvgc","sxptjdmqfv1eightsevenfpxpdnrtnqkdxhnzdm","grdgt9ninedxnqhrts","8sevenxcsl1","fiveeighttwo5","bgroneight2pgzdpnzgchkq1","5twozc62foursixeight","six61","cbxzoneeight1","hntwonebmslklfkfgpngvffour5","1262ninemdjsrdk","roneightqnjseven2","rmnpjzflcmqdrdseven3","ltwollzgvr1fiveeightjvv7","kkc5fourfive89","cqnnhjxp4dtt","jeightwo1fgtlfpsixtwo9pptcpmjjsixone","832","9eightkhlprvq7seven","ninegeightbfvnvvnpslspcmscvqcqb6","jgksh2lkss6onexznvfhq","flqhlpkzjvq3qvvgvjscr6v9eight","hrgeightwo8","3fvpkbrhqchlbsxhlqfone3eightmhtxbrninerbkrsnxbjg","871eightnineq5f2","6jnonergcjfvkhfive","one47fxgvgmoneoneoneg","5xktmbkqftrlvztctxnqprpnine","eight4tfvsbtmhtwol","rbjdrmbcrs9chvcj7s","eight12bdzqtvnqeight27rpt","fq713oneone6rgrnd","cdt96","dbfrd4rczmbgnmfrltdlpbseven7lqhfive","fourdxxkqjfpjxbcthzhbl67eightzks19","2four5ntghsdcsdrjpbrtrt3bzgbtfnknine","tvmnjgcsixnine8zrc39five","5kcbfkj61three9tsqpvzdd","qsmseventhreeone4twosix","twosix2","jzsmxs9plpsixpqxffive","sixthreeseven4flbct","mpplmsrjvz9","8ttgt9ninesevensevengnprjnvxpjz","8gmpgvbfjcdsnkcth9bbnqsqhqqzeight42","nk5b","four98six83five","415rqgdfsix","mqrkmbvtm668","6453twoone","9fiveeightseven4gsshznxbkb5","seven3ninedgthree","jckgvtvrs3six3trrzfrxfnm8","98fivexxdqpmv74fbthtqqfourvttxnck","fivenineonefour46tccfkrsrpqnxhtm","twobdsqhnscrkbzt19","llmccgn8","6eightoneonen57","meightwo1cjqsm3sixlrr","98842","twofnsvbsxkxrzghhrz29","tzfjthreebkkljhninetwoone6zgpgsgxq","fournkcgf85seventwo","642","four1oneninejbstfcdgjkjtppskglj1","4four9eight2tnphxvfour","sixjhcnxkksxthreeseven1four1","rb34pqtnnfive2sevenone","33sevennlnhrkkbshonefnrqq72","3sevenfourlmqzfdjrq","tmttpfb4mghtcpnine","nhlqlcxff8","fiveone5gxg","fivecrjmsgljxb1mqmffour8mgtdxsjsix","1jdkvzfmbq","ndzqgk6","threeg7twofour2twossldnmthree","5rsltvdtworrglclfpctml3","nine6fourmcqbhbvlmzgnfqtbcs","5eight92","ninefivefour3kbnmrdmxjg2","73vprclhthzz8","ninettjnnkrsix9kvxjknzkmsxtvdn","bgzfv59fhsvcjvlgmhhzph58","threeonefivecgjstcmp57","9onefoursix","sjqjvd4three91","9ccdjqfivefourfive6mrnkjqf","7lzdrzjheightthree6","43","nineb8sixqqsxrpn","fgkj15eight6gggndbjxvthree","one3sevenlfjqmbmssgbzs8pzjptxgvq","77fiveqpjpfdqteighttpfh","2333twonezrr","8p4cxnjvbjlh9ninesix6","ninefour95","67twosevencktwopjcmcxr","9four1threejbrdmtkzn","ninenjhstmmmj3four","4lnqjqtwo3zxfznvp","sixfivesrxnttwochrkdrr7","4three1","tfeightwo9two69five","oneseven3sixfournnpkhhx9","mdl8kfpvthree","fxcxgmq5three3ninehdc8","one9eightfiveonernhbcxjninethree","9three3fcpgxksix","nine346946one","hzkpbmdzdmsfkrbxvs6pnmqsevenlnr","kzsgmsix5","kdjdvvdl2","8lcpfkhdltwo","xjzfbgrmvxprqpflpbk9cnpxdkgmvvjz8vbrjhxvthfsjkk","onefive7","tjqmxncdbmsjznine1zlr","648bhzlqnlvrshdgzonefive","eight2sixtdzznchf1seventwo4","sevenzcmpbfbzdvjlztpx62","5961","97192fivethree","seven1mcxnqqzvpp5","8qn1eightseven","hcrrthreesevenlkvhfbj96twonine9","two8four","hpkttfdpgb16","19oneseven2onerl","347seventwo","eight4threempfbxbssrrkscnc4eight","555qrppcplpgtworxgbgdjdhltwothree","v9627","twoninenine72tkcbk","one5jhczrlqmhr","qnhr4xlckprn9x3bzrdbfrdql9","lgtdv99kmgjjkzfive","lrclbljqqpninerrjptvpfour2","fiveltkcgdvgkeight7seven","twongdsevenfivefive3foureightwonn","8svdmkflj","rlbf4sevennc4jxsskjgktwodsxgtlkthree","seven4nine4fivezjfsjghbcninefk","drghcjthreevstpdfth6sgqtx","zkfthreefptvnvb9five","gjcqspnkztlqdnzl6","6nineqzgvhcnhjxbmtkcfm8one5five5","threesevenseventwoqrcvpvvrdljfone3","v44nlcdx8eight","eightseven3bmfzeightzccxqk6ftlsmfp","seventhreeseven3","7eightgvxcdxzplrthreelqgbhvpqffivefour5","8coneckchx5pfive","xhbbmsvjnonethree4","lnktfknbqfive4seven","8prvncdq97hjjltzreight","2dfktgjgdrvfour","9onesixone","873lsmllvsvp","61dcjgpjvqxj","xtwosixfiveseven2two","p4","threescgqlmkt43one","plffdq4pcqfoureight9one","357qzoneztwo6","6ztllqsixgtfgcr","4nineoneighthch","fivesevenninesevenvpnfkjpeightjsvtqxgrx35","8nsbjtjrhnv36","4eightseven","5rksnms6fgcnrttgl27four9l","3gknvvffflfgdg","8ts98n32one","4vmvthreefourmttwo","sevenskfmmmsjone95","seven4fmnxskg2516four","seveneightzjdnjthreethreefourpj3three","two8one44three3","bffeightwo3twosxljzljbllrtttzsevenxfonetwofive","5eight5sevenfour","4fkxqm","7nine4seven","6eight3sevenfive6pxjlschvhm","5nine7spbqddhrqcbzrvhkrt88","cnpbkmbfour88","41twoeightlgcjfvms","hktvctnine6mzccvthreefournine","1dr66mg5one","five74","bsrrldft858six2oneightm","mmsvhxsm68seven","lnjcnn4fiveninerlsqkcn3","fgzjrlmfjktwofournine5782three","1two8fiveninegndtnzndf41one","kstskp4one9ponejlcqdvgkkdfive","four7two","mzcbhhxgkfourfour34","qvhnpbmvdbgxbnhcgthreesq7dvmdnhl9","1jhmkdmmmjg","6xzpvzvqbrnine8gg1771","sixone9qvfft","6eight152two6sdbl","sevenjlpmzv7","jntrfc5","ztspfjhk4","9fournlslrmlr3","2kqsxx5","3nineshlmjsevenfiveonellrtr","7hcxxjkbsvknbmtwotninesrpsszktzjlntwo","fv1six81","onetwo4eightsixjkgmtvxptnxltqtptncfsix","eightzvmmone3eight9dglsqq5","jvqs4sevendl","551six3oneseveneight","5jtcbrmtbjmrb4sevensmmrctntvz7five","9lrnfive4","twoxfltgdg5six","one4threeeight3eight4stlp","2rpxk95sixslsc895","seven15","1sixsix9sevenkhlnhqtzptwovzrmbr","two55six","twofour3","eight6fiveeightbmrr1sevenk3","4flbntjtfivepzkjplzxn7","ljnpmnskjsixthreehpqdkccffg4sixfszddbz","9gfsqhmonelgvxpkmnhldmthree7","5vthvsrcbxbcrgqnine","six6nine2v","htnvsfmz7dtvthree6sevenfourfourrmsdfhkd","pb24","sbmmdnfvmlfourfivenvcnb3jrctctmrhm","2fourone52hkjvd4","1bhpbmxhtr4eightwolkd","5qrqbxtgppvvcms","mgcgxpmj4dl3zfckcskbqnsknlctwonxsddvhl","6zfv66onetwosixtwoxdx","676jmzcdbcjnfrlrgqzfkmdxz","oneqhgcqjmjq4","three6qvlkksf98","fivesix614s83","threeone9kplvzq28threegcmtrzzlsix","5lxcjrvbthreednttcxfnfiveseven","threeeight5seven5jlhhfour2","xcppxkxqffc6six","fouroneseven1xrdtbvdsix","vfqzhvzclbpj2","5seven8xlhfivetwofivedvlbtvzvs","7bjlrvnncgsseven7six","3qsnhs","2fivefour5","gjgzjs1s","vxhlxvgj39","three1lvnrfrbzj6nine","oneftpcjskxzhv21one2twomshxlh","nine36","ninetwojfqbjkbtrfseven4nkszvtjnffeightwoxdd","eight1eightfiveonerzr4","sevengtwokzcxvvg4","qxkmfdznfive98eightfourprmsixthree","1two743six","274sixqqq62j","sixfour4fourstxrskpxc1eight7","2fourrzngcnlm112twoone8","nnqfmonerrpxeightfive9","klzrfbxjnznzkt24pjngplcdlftjz","66gbsllhhgxn38","threelzzrxspvq8four","qtvtpqspqflonetfrzvkthreeone8gsjqzgnv","9vhlxrqtdmzrpfqh74zsgnmsdlqgcp2","qkkkhxbrk35eightjpnmb761one","4vp4four49two","five6nrmvcfzlt665","skkqlzl1mrkgncmqnine68xvhfcsc","two17kbjcdsstlxst6","foureight3twonglgrv","6nine5","pgcmqzcfninepbgcrbzseven5zplhhbrjbpxj","sevensix6fourtwonpninebt","eight7951one","glvndtgdfkzzcbsmt36sevenfour3eight5","dtvgrkkzvhflhcsknhsccmxzgfivetcpz4zrcl9one","jpg3onenineqzjseven8phltdpjrsr8","68one","gctzfjksevenszfblxone2seven6pd","93nine42","two19four97crzhqndbqpmpvj","3six4mrntvlzntmqgcmms","1gmpdqpfkkz","xmsv3eightmdnqkdtzn814","395zqfqrgzs","9eight81cpnvrkkl","7rddzbqfm5fouronekxkhlgf1","fkclxddmxrpqzhqeight697","2mtvxtgq5six","3one9qvnpnmhzj6","rvvf3six9fourrq","r2eight55gvgpfs","dtztwofivefive12","three6zfqhnjzvr2twosevenoneightqp","sgleightwo2974c24","pplpgxnvzfpv4xlfive11four","58one","61four29","eightgxcgbrzd8five8","jxdzbxcc1one6pfivesixfiveg","two542cvjxvmhhthreexkl","three8nhzz4","sevenseven1seven14pxtwothree","mpdcbdjkp8ninethree","fourthreeg9pnine","onesixfourtckbkjdkqbfjkgpk54","qxh1twoclvzvsvgk2dvpkncltdt","fivefourhjckmndtdp98jzgqvrhbhxeighttdxkjltrdq","296dvxdxhdb4qbnmkzxh","djsrgct28vjkvsttnlf4","7rhdkfvqbxninegnkbgcqv1four42","seveneightdcb7sevenpdvqlmkvfive","39lr83hhhrfivexbhr","zx32sixeight","7hsxxzjjdh4rc55threeseven","5oneseven2sevenfourtwothree","9oneqc3seventwofive5","five2hnfkvsxmhjfivefivesix","3sixnine59three6mncxxxhkgxzlxscdzplm","eight9three62sixfour","26hfc4four1","jrnxgrvrctbg3nine","four73dqfiveeighttwosevenknq","94nine8fivevnvlnf","twopg79nine6kkpfgmpdlqhfc5","511twogghonefour","bvdneightsevenfcjnhccrlb7nine","lpfoneightfrnsrpgkzsixv8","1sevenseven981","53kvftth53fourc","zcmkkshveighteight1","9sixcrfzhfxzzrrdtkscp","8fhslkqzsc5jlpthreeninemjftx","rsfourfkglt1hfvhgeightfourvbmsnine","sixninefive5","2jqdfddkzzqxnkv8two","sevensevenmxhpqvmngfivecnhvg18","threesxrninenine31sixnmnssk","kzvvsvbjrfoursix6four","ckvmxptpxrvpsfvt9nine","66ninezgxttq1nineninexggjrtzgg7","two2eighthsrnine5pmptccfkfcpcmkn","seventqsqhbftscfonekdhrctnlcfdgzhvshsjgsbq7","nine1mdpxvlxkdx","pm4eighttwo","81ggljdxsthreeninefive","twofivenine39three","six152sixp","threemztwotwo5fiveseven","31twoninefsxmpsjx6eight","seven2deightone5threethree","hxmthvjphjdgctfpt4dfhxseven","4twoeightzx8","9dzbjqnnmbseven7","crdtprqs455onedmzvkzmmm","jqcxsxblgml1","9sbqzndbsx3twoseven7","eight8threezvvqbrsix34","ztzlrsg4qghxkvspvcsix2jndhxzfrm","6twovjkjgptwo43lg","1psnbrkbhb8seven","xfxqjrggpmtf4fivenine79","6pdv1xpsgr","zb4rqrqxsevenvklzmslqls","fourlstone7","53joneeight8ninef","1315","1qj4","djeightwocxrnf5fourone4eightbqj","jrgxvsmnzg5","twonsjbzvtqhgfivejdhxstbzrbtpndnjlvb7hhxfmrxtfxrcmjs","67xbctwo","7nbsrhcvrqj","fqnl9foursixtdgbcncr85three9","gmg4mr3rvdt","19qhmhvpzfour","pkptr6lssnqxncztpbt8","sjqtxbxp5twoseven1onerrsqghcfpncgkfour","7four8spgzfoureightthreedqp","two9bxlqs","deightwoninethree8","3plpprmmhvvsnvdzjzr9sqgbddpghthreejjmldhdqqm","sevenfiveseven4bkvxkzqbtxjvdsltfkn","sevenssfkdmvmntpxjpqlj8px","4hk9","fivenxcmhf78pmdd6mmqfvdxqbh7","five9hvfive7","eightfourrpflnfourtwo61","threenine2","ncdpjqcnine1twoonehglvzpzf","jmtpbhbshrvmhvqt38brsqpxn4one6","onesixvmmhsevenfoureight2six","ttwosix5nineb3eightthree","cmkdmhkdf3zdhjfmb","three5fiveqrrxrdtsixtwogntmvxsggqfive","oneeight5eightfive38twonegv","cqlfhlch924mpmqfvtwo","jrnzg5four3fivetwokxphktf","seveneightmzmzftx9gsmxjkj1stjbvxlvmlcdgnine","twonineeightninethree6blhm","3kskponetfgjgzphqtr","ntwo2","5six1vksjzrlgjnxtwovbkrdlhjsmzdxcf","twosixkfmcfndlj453two","six5twotzbzqtwo","fivenpcqfour5twonej","nineninefouroneztvqspscnk4twoklbht","bqcbm19hckcgtcfkb44eighttwo","52jcrbqbkhjx5nine8","5threethree","3twotrnnlstrndthree9","15zsnrfshn7twoeightsmvsfztx","789ckpxflvkr","skxlnpxxdgbhqnineninejsltrx8three","1sixone724","2seven4","7knspxrzszdbgc3seven","vsqmpf5sixsix9eightdtgmpxrksb","three6btwo11fived","bckqdndnine7bpzvkxkdqtwoseventxpzqg2","one6ntmlmfkfmjfourmgddpzfr5scjhhmgsix","four12mlhdscsxfiveonesevenlone","9rdlctlkc","11vjvjsllfivenv","2four6fourfive","5czmqmdkkthree3","sevenfive9","sevenfivemqjhqh9mvdkgtr","glvpdbbhxs9","four2three","six6gtdbttnhvkvh","5fcsbnpsixeightonetwo3","5psvznthreethreefive5qrkftfkqsix","36lmm","seven33onefournlr2","13seven","onejdxgxjpcsix1sevenpzbzthree","sevenqcjsxz6twokkpzllzqninetwo","1367mtsldgrdeightp","five111hbp9tlqp","threebbnine7onesix2twoneg","mxmpnxmpqponeeightktxvgkcdr7","411fourdhrdvrz","zxkmcr5eightkzqsixsix7","six972zleighttwonvgvth","vnmmbzfpttwofnjd76","twopnthreeqzlvkptmph9vnkbxghnone66","nine1fiveninethree4","mdrdpbsfcjsixpnxfour2four2","sgjrdtmzcj2mbnlbtqsdboneeight","9jbmhchfrnfqvxcjtwokrbjvzmcxrj","4jhjksqvnqsevennfrtslcgjbrhfour","6eightlzrrxfbcjeight5six1kzhtpbz","jqsmqbzpntxdfvdthreezrqzdhthreefmvslxk6","eight82two82zqghmbd","qtwone4d","6three16","9eightdmtkznh6","znc1185","eighteight665bxbngx5dvht2","9seven83three","mqdnhqfdgzfshjttvfour3hq92qtpdblnvdsxcskz","twofourfivedfffknb6ljxjlsq48","6pbdfrqpfour","vmtkqpjftc9twonej","rhcstmvxdnjgldpmlmsnineglmkntfiveeight3lgnlqmjkzl","rxzbjxjhkvhtxps2twohlcdgkrbdbmxvpf4five","1three9two","bp234jszvspdq","rcmhnmb3lpxneightfivetn7","srdh461fourcrhhkbxftghxqrptn","rlhlrm894","jtmmljgmmppknktqrbjtwod9","75kvnbm","psbcdponesix218","ndx5zthreetwokjjvzkjk","onerhnmsxmseven7two2snn34","nvmfj6hqdspmndlzqhrrznrpcgn","lqqgdmn5fivesfbqhveight1","one5pjpskd25four3","91dxxjkrthreethreefourfiverrdhqtwo","3sevenhbrznfcqmfivepqnmzxvlldhfdrvkqfmxzx8","lrfflx9pvrfctxkxk432","ninerhjlqfzg3fourbvfkbmxbntz1","6dkgtthreebjfgjqnv6lveight","seven527rgztslznxdkgrgf6one","npchxbnb5zpzrllhx777","rfour4qkvcxsbjnveightwogm","foursixsevenppnrdgpnrkbr5","3three4lm","1dmxvfour7","fiveh1eight","643","fivelsffmhsldlfkqkb2threek6three","23dpbpjcsqslnine4799","shvkdvntpmvt52dvclb5bjdj","eight5sevenfbjrpbdsdzhnc","dv2vqtqghlkprxx6three","four1six4fnznbcdghfzpd","eightfiveone4fourone","two75four85","3331","9eight1seven","9threexbsevenfour","22meight1","75two","five6onetwordjsgltj","oneseven9one","djljfzv7cnpnvhmqkjgn5eightsix97","three8xpskzk","nzgpp7fdcl6twotwochsgztwo","1tfvvmzfd4threekgqdthreesfxjggmszz","7krlgg8864gfp94","3xxpkqxfxcn","eighthl4cctb26bppqpsc","eight5rq","hncmdrmfive4","qml6mmx","qpckxnrjbdlprhmrqeight3bcjtghrrfvczqxeight","nine6five","fourmnzrtwocvdkmlc6","3sixseven1mnbdqfgcqqcpsix","ninekvxrhk2jjjrdlqf49","7seven743","xnrz1m5","cseven8pg2","hxbfzndh6nltvbv","7zxdkghnzrzljlqftwo7hfmptrgd","5jltxrmxn","9eightqskgfndxsgmsrprhsvnninellts","dz88","99nine","rphppqzzxk2four","2nzeight","four44two","qtwonetwodgbhqmtzf82onefive48","6fivedhmv","xsvpdrtvr28ltsjseven","foursixfour61nrseven","qrhtwone3tmtsixf","sqjvg2pzbzpgthreenine6cpsq","jlvnsbshjmxnxfouronesix2zlff5","rzxkpczkn1bkcfbpbcb","9nmkljlqmd9fivenine7fivexndtdghpc","6twovgpsevenmzcbjtnd3threegmsltfhrgq","fourmktnjsk4839ljqvqf","47hcbcnhjgxhdfn7rrbonehvlmddbone","26fchgtdnbtwo8jpqxkb","7dxtslxqkbqfivefive","sixnineqnjmseventwo5gh2c","three1eightvxeightwogrd","twotwoninesixxdvrxv5","sixonetqddfmone1seven7","fourseven9ninefoursxnnnfcbtb88","twonpbnblrh3qckkxckflprdnr4","6eighttwo2sevenqml","three1twotwon1cjfnnnlptc","tlqtgktgjtgfour24four91","ghseven56sevensixhfstvk","qd8fourvmvgmssixsix8oneightps","jjvhthplcgzdndmrnxmctrtnndmzztnggr9rspflsix","jqk39fivetwo","nine2sixrtwothree","gccjpxtcxfone6six6nine5","7twoeight8flzqk77","mjljctdbg8","sixthree8","bbdlvtsjhjst88","dklhhhlpqqxlgdzzheightjntbmlfour4","ggrbl5cthnzlsbjssixpt")
    println(findSum(input))
}
