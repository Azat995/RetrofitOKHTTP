package com.example.retrofitokhtttp.model

import com.google.gson.annotations.SerializedName

data class NationalityResponseModel(
    @SerializedName("count") val count: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") val countries: List<CountryResponseModel>
)

data class CountryResponseModel(
    @SerializedName("country_id") val country: Country,
    @SerializedName("probability") val probability: Float
)


enum class Country(val countryName: String) {
    @SerializedName("AF")
    AFGHANISTAN("Afghanistan"),

    @SerializedName("AL")
    ALBANIA("Albania"),

    @SerializedName("DZ")
    ALGERIA("Algeria"),

    @SerializedName("AD")
    ANDORRA("Andorra"),

    @SerializedName("AO")
    ANGOLA("Angola"),

    @SerializedName("AR")
    ARGENTINA("Argentina"),

    @SerializedName("AM")
    ARMENIA("Armenia"),

    @SerializedName("AU")
    AUSTRALIA("Australia"),

    @SerializedName("AT")
    AUSTRIA("Austria"),

    @SerializedName("AZ")
    AZERBAIJAN("Azerbaijan"),

    @SerializedName("BH")
    BAHRAIN("Bahrain"),

    @SerializedName("BD")
    BANGLADESH("Bangladesh"),

    @SerializedName("BY")
    BELARUS("Belarus"),

    @SerializedName("BE")
    BELGIUM("Belgium"),

    @SerializedName("BJ")
    BENIN("Benin"),

    @SerializedName("BO")
    BOLIVIA("Bolivia"),

    @SerializedName("BA")
    BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina"),

    @SerializedName("BW")
    BOTSWANA("Botswana"),

    @SerializedName("BR")
    BRAZIL("Brazil"),

    @SerializedName("BG")
    BULGARIA("Bulgaria"),

    @SerializedName("BF")
    BURKINA_FASO("Burkina Faso"),

    @SerializedName("BI")
    BURUNDI("Burundi"),

    @SerializedName("KH")
    CAMBODIA("Cambodia"),

    @SerializedName("CM")
    CAMEROON("Cameroon"),

    @SerializedName("CA")
    CANADA("Canada"),

    @SerializedName("TD")
    CHAD("Chad"),

    @SerializedName("CL")
    CHILE("Chile"),

    @SerializedName("CN")
    CHINA("China"),

    @SerializedName("CO")
    COLOMBIA("Colombia"),

    @SerializedName("CR")
    COSTA_RICA("Costa Rica"),

    @SerializedName("HR")
    CROATIA("Croatia"),

    @SerializedName("CU")
    CUBA("Cuba"),

    @SerializedName("CY")
    CYPRUS("Cyprus"),

    @SerializedName("CZ")
    CZECH_REPUBLIC("Czech Republic"),

    @SerializedName("DK")
    DENMARK("Denmark"),

    @SerializedName("DJ")
    DJIBOUTI("Djibouti"),

    @SerializedName("DO")
    DOMINICAN_REPUBLIC("Dominican Republic"),

    @SerializedName("EC")
    ECUADOR("Ecuador"),

    @SerializedName("EG")
    EGYPT("Egypt"),

    @SerializedName("SV")
    EL_SALVADOR("El Salvador"),

    @SerializedName("EE")
    ESTONIA("Estonia"),

    @SerializedName("ET")
    ETHIOPIA("Ethiopia"),

    @SerializedName("FI")
    FINLAND("Finland"),

    @SerializedName("FR")
    FRANCE("France"),

    @SerializedName("GA")
    GABON("Gabon"),

    @SerializedName("GM")
    GAMBIA("Gambia"),

    @SerializedName("GE")
    GEORGIA("Georgia"),

    @SerializedName("DE")
    GERMANY("Germany"),

    @SerializedName("GH")
    GHANA("Ghana"),

    @SerializedName("GR")
    GREECE("Greece"),

    @SerializedName("GT")
    GUATEMALA("Guatemala"),

    @SerializedName("GN")
    GUINEA("Guinea"),

    @SerializedName("HT")
    HAITI("Haiti"),

    @SerializedName("HN")
    HONDURAS("Honduras"),

    @SerializedName("HU")
    HUNGARY("Hungary"),

    @SerializedName("IS")
    ICELAND("Iceland"),

    @SerializedName("IN")
    INDIA("India"),

    @SerializedName("ID")
    INDONESIA("Indonesia"),

    @SerializedName("IR")
    IRAN("Iran"),

    @SerializedName("IQ")
    IRAQ("Iraq"),

    @SerializedName("IE")
    IRELAND("Ireland"),

    @SerializedName("IL")
    ISRAEL("Israel"),

    @SerializedName("IT")
    ITALY("Italy"),

    @SerializedName("CI")
    IVORY_COAST("Ivory Coast"),

    @SerializedName("JM")
    JAMAICA("Jamaica"),

    @SerializedName("JP")
    JAPAN("Japan"),

    @SerializedName("JO")
    JORDAN("Jordan"),

    @SerializedName("KZ")
    KAZAKHSTAN("Kazakhstan"),

    @SerializedName("KE")
    KENYA("Kenya"),

    @SerializedName("KW")
    KUWAIT("Kuwait"),

    @SerializedName("KG")
    KYRGYZSTAN("Kyrgyzstan"),

    @SerializedName("LA")
    LAOS("Laos"),

    @SerializedName("LV")
    LATVIA("Latvia"),

    @SerializedName("LB")
    LEBANON("Lebanon"),

    @SerializedName("LS")
    LESOTHO("Lesotho"),

    @SerializedName("LR")
    LIBERIA("Liberia"),

    @SerializedName("LY")
    LIBYA("Libya"),

    @SerializedName("LI")
    LIECHTENSTEIN("Liechtenstein"),

    @SerializedName("LT")
    LITHUANIA("Lithuania"),

    @SerializedName("LU")
    LUXEMBOURG("Luxembourg"),

    @SerializedName("MG")
    MADAGASCAR("Madagascar"),

    @SerializedName("MW")
    MALAWI("Malawi"),

    @SerializedName("MY")
    MALAYSIA("Malaysia"),

    @SerializedName("ML")
    MALI("Mali"),

    @SerializedName("MT")
    MALTA("Malta"),

    @SerializedName("MR")
    MAURITANIA("Mauritania"),

    @SerializedName("MX")
    MEXICO("Mexico"),

    @SerializedName("MD")
    MOLDOVA("Moldova"),

    @SerializedName("MC")
    MONACO("Monaco"),

    @SerializedName("MN")
    MONGOLIA("Mongolia"),

    @SerializedName("ME")
    MONTENEGRO("Montenegro"),

    @SerializedName("MA")
    MOROCCO("Morocco"),

    @SerializedName("MZ")
    MOZAMBIQUE("Mozambique"),

    @SerializedName("NA")
    NAMIBIA("Namibia"),

    @SerializedName("NP")
    NEPAL("Nepal"),

    @SerializedName("NL")
    NETHERLANDS("Netherlands"),

    @SerializedName("NZ")
    NEW_ZEALAND("New Zealand"),

    @SerializedName("NI")
    NICARAGUA("Nicaragua"),

    @SerializedName("NE")
    NIGER("Niger"),

    @SerializedName("NG")
    NIGERIA("Nigeria"),

    @SerializedName("MK")
    NORTH_MACEDONIA("North Macedonia"),

    @SerializedName("NO")
    NORWAY("Norway"),

    @SerializedName("OM")
    OMAN("Oman"),

    @SerializedName("PK")
    PAKISTAN("Pakistan"),

    @SerializedName("PA")
    PANAMA("Panama"),

    @SerializedName("PG")
    PAPUA_NEW_GUINEA("Papua New Guinea"),

    @SerializedName("PY")
    PARAGUAY("Paraguay"),

    @SerializedName("PE")
    PERU("Peru"),

    @SerializedName("PH")
    PHILIPPINES("Philippines"),

    @SerializedName("PL")
    POLAND("Poland"),

    @SerializedName("PT")
    PORTUGAL("Portugal"),

    @SerializedName("QA")
    QATAR("Qatar"),

    @SerializedName("RO")
    ROMANIA("Romania"),

    @SerializedName("RU")
    RUSSIA("Russia"),

    @SerializedName("RW")
    RWANDA("Rwanda"),

    @SerializedName("SA")
    SAUDI_ARABIA("Saudi Arabia"),

    @SerializedName("SN")
    SENEGAL("Senegal"),

    @SerializedName("RS")
    SERBIA("Serbia"),

    @SerializedName("SC")
    SEYCHELLES("Seychelles"),

    @SerializedName("SL")
    SIERRA_LEONE("Sierra Leone"),

    @SerializedName("SG")
    SINGAPORE("Singapore"),

    @SerializedName("SK")
    SLOVAKIA("Slovakia"),

    @SerializedName("SI")
    SLOVENIA("Slovenia"),

    @SerializedName("SO")
    SOMALIA("Somalia"),

    @SerializedName("ZA")
    SOUTH_AFRICA("South Africa"),

    @SerializedName("KR")
    SOUTH_KOREA("South Korea"),

    @SerializedName("SS")
    SOUTH_SUDAN("South Sudan"),

    @SerializedName("ES")
    SPAIN("Spain"),

    @SerializedName("LK")
    SRI_LANKA("Sri Lanka"),

    @SerializedName("SD")
    SUDAN("Sudan"),

    @SerializedName("SR")
    SURINAME("Suriname"),

    @SerializedName("SE")
    SWEDEN("Sweden"),

    @SerializedName("CH")
    SWITZERLAND("Switzerland"),

    @SerializedName("SY")
    SYRIA("Syria"),

    @SerializedName("TJ")
    TAJIKISTAN("Tajikistan"),

    @SerializedName("TZ")
    TANZANIA("Tanzania"),

    @SerializedName("TH")
    THAILAND("Thailand"),

    @SerializedName("TG")
    TOGO("Togo"),

    @SerializedName("TT")
    TRINIDAD_AND_TOBAGO("Trinidad and Tobago"),

    @SerializedName("TN")
    TUNISIA("Tunisia"),

    @SerializedName("TR")
    TURKEY("Turkey"),

    @SerializedName("TM")
    TURKMENISTAN("Turkmenistan"),

    @SerializedName("UG")
    UGANDA("Uganda"),

    @SerializedName("UA")
    UKRAINE("Ukraine"),

    @SerializedName("AE")
    UNITED_ARAB_EMIRATES("United Arab Emirates"),

    @SerializedName("GB")
    UNITED_KINGDOM("United Kingdom"),

    @SerializedName("US")
    UNITED_STATES("United States"),

    @SerializedName("UY")
    URUGUAY("Uruguay"),

    @SerializedName("UZ")
    UZBEKISTAN("Uzbekistan"),

    @SerializedName("VE")
    VENEZUELA("Venezuela"),

    @SerializedName("VN")
    VIETNAM("Vietnam"),

    @SerializedName("YE")
    YEMEN("Yemen"),

    @SerializedName("ZM")
    ZAMBIA("Zambia"),

    @SerializedName("ZW")
    ZIMBABWE("Zimbabwe")
}