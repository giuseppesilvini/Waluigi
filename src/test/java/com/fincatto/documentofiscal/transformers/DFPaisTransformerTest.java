package com.fincatto.documentofiscal.transformers;

import com.fincatto.documentofiscal.DFPais;
import org.junit.Assert;
import org.junit.Test;

public class DFPaisTransformerTest {

        @Test
	public void deveTestarLeitura1() throws Exception {
        Assert.assertEquals(DFPais.AFEGANISTAO,new DFPaisTransformer().read("132"));
        Assert.assertEquals(DFPais.ALAND_ILHAS, new DFPaisTransformer().read("153"));
        Assert.assertEquals(DFPais.ALBANIA_REPUBLICA_DA, new DFPaisTransformer().read("175"));
        Assert.assertEquals(DFPais.ALEMANHA, new DFPaisTransformer().read("230"));
        Assert.assertEquals(DFPais.BURKINA_FASO, new DFPaisTransformer().read("310"));
        Assert.assertEquals(DFPais.ANDORRA, new DFPaisTransformer().read("370"));
        Assert.assertEquals(DFPais.ANGOLA, new DFPaisTransformer().read("400"));
        Assert.assertEquals(DFPais.ANGUILLA, new DFPaisTransformer().read("418"));
        Assert.assertEquals(DFPais.ANTARTICA, new DFPaisTransformer().read("420"));
        Assert.assertEquals(DFPais.ANTIGUA_E_BARBUDA, new DFPaisTransformer().read("434"));
        Assert.assertEquals(DFPais.ANTILHAS_HOLANDESAS, new DFPaisTransformer().read("477"));
        Assert.assertEquals(DFPais.ARABIA_SAUDITA, new DFPaisTransformer().read("531"));
        Assert.assertEquals(DFPais.ARGELIA, new DFPaisTransformer().read("590"));
        Assert.assertEquals(DFPais.ARGENTINA, new DFPaisTransformer().read("639"));
        Assert.assertEquals(DFPais.ARMENIA_REPUBLICA_DA, new DFPaisTransformer().read("647"));
        Assert.assertEquals(DFPais.ARUBA, new DFPaisTransformer().read("655"));
        Assert.assertEquals(DFPais.AUSTRALIA, new DFPaisTransformer().read("698"));
        Assert.assertEquals(DFPais.AUSTRIA, new DFPaisTransformer().read("728"));
        Assert.assertEquals(DFPais.AZERBAIJAO_REPUBLICA_DO, new DFPaisTransformer().read("736"));
        Assert.assertEquals(DFPais.BAHAMAS_ILHAS, new DFPaisTransformer().read("779"));
        }
        
        @Test
	public void deveTestarLeitura2() throws Exception {
        Assert.assertEquals(DFPais.BAHREIN_ILHAS, new DFPaisTransformer().read("809"));
        Assert.assertEquals(DFPais.BANGLADESH, new DFPaisTransformer().read("817"));
        Assert.assertEquals(DFPais.BARBADOS, new DFPaisTransformer().read("833"));
        Assert.assertEquals(DFPais.BELARUS_REPUBLICA_DA, new DFPaisTransformer().read("850"));
        Assert.assertEquals(DFPais.BELGICA, new DFPaisTransformer().read("876"));
        Assert.assertEquals(DFPais.BELIZE, new DFPaisTransformer().read("884"));
        Assert.assertEquals(DFPais.BERMUDAS, new DFPaisTransformer().read("906"));
        Assert.assertEquals(DFPais.MIANMAR_BIRMANIA, new DFPaisTransformer().read("930"));
        Assert.assertEquals(DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA, new DFPaisTransformer().read("973"));
        Assert.assertEquals(DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA, new DFPaisTransformer().read("981"));
        Assert.assertEquals(DFPais.BONAIRE, new DFPaisTransformer().read("990"));
        Assert.assertEquals(DFPais.BOUVET_ILHA, new DFPaisTransformer().read("1023"));
        Assert.assertEquals(DFPais.BRASIL, new DFPaisTransformer().read("1058"));
        Assert.assertEquals(DFPais.BRUNEI, new DFPaisTransformer().read("1082"));
        Assert.assertEquals(DFPais.BULGARIA_REPUBLICA_DA, new DFPaisTransformer().read("1112"));
        Assert.assertEquals(DFPais.BURUNDI, new DFPaisTransformer().read("1155"));
        Assert.assertEquals(DFPais.BUTAO, new DFPaisTransformer().read("1198"));
        Assert.assertEquals(DFPais.CABO_VERDE_REPUBLICA_DE, new DFPaisTransformer().read("1279"));
        Assert.assertEquals(DFPais.CAYMAN_ILHAS, new DFPaisTransformer().read("1376"));
        Assert.assertEquals(DFPais.BOTSUANA, new DFPaisTransformer().read("1015"));
        }

        @Test
	public void deveTestarLeitura3() throws Exception {
        Assert.assertEquals(DFPais.CAMBOJA, new DFPaisTransformer().read("1414"));
        Assert.assertEquals(DFPais.CAMAROES, new DFPaisTransformer().read("1457"));
        Assert.assertEquals(DFPais.CANADA, new DFPaisTransformer().read("1490"));
        Assert.assertEquals(DFPais.CAZAQUISTAO_REPUBLICA_DO, new DFPaisTransformer().read("1538"));
        Assert.assertEquals(DFPais.CATAR, new DFPaisTransformer().read("1546"));
        Assert.assertEquals(DFPais.CHILE, new DFPaisTransformer().read("1589"));
        Assert.assertEquals(DFPais.CHINA_REPUBLICA_POPULAR, new DFPaisTransformer().read("1600"));
        Assert.assertEquals(DFPais.FORMOSA_TAIWAN, new DFPaisTransformer().read("1619"));
        Assert.assertEquals(DFPais.CHIPRE, new DFPaisTransformer().read("1635"));
        Assert.assertEquals(DFPais.COCOS_KEELING_ILHAS, new DFPaisTransformer().read("1651"));
        Assert.assertEquals(DFPais.COLOMBIA, new DFPaisTransformer().read("1694"));
        Assert.assertEquals(DFPais.COMORES_ILHAS, new DFPaisTransformer().read("1732"));
        Assert.assertEquals(DFPais.CONGO, new DFPaisTransformer().read("1775"));
        Assert.assertEquals(DFPais.COOK_ILHAS, new DFPaisTransformer().read("1830"));
        Assert.assertEquals(DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA, new DFPaisTransformer().read("1872"));
        Assert.assertEquals(DFPais.COREIA_DO_SUL_REPUBLICA_DA, new DFPaisTransformer().read("1902"));
        Assert.assertEquals(DFPais.COSTA_DO_MARFIM, new DFPaisTransformer().read("1937"));
        Assert.assertEquals(DFPais.CROACIA_REPUBLICA_DA, new DFPaisTransformer().read("1953"));
        Assert.assertEquals(DFPais.COSTA_RICA, new DFPaisTransformer().read("1961"));
        Assert.assertEquals(DFPais.KUWAIT, new DFPaisTransformer().read("1988"));
        }

        @Test
	public void deveTestarLeitura4() throws Exception {
        Assert.assertEquals(DFPais.CUBA, new DFPaisTransformer().read("1996"));
        Assert.assertEquals(DFPais.CURACAO, new DFPaisTransformer().read("2003"));
        Assert.assertEquals(DFPais.BENIN, new DFPaisTransformer().read("2291"));
        Assert.assertEquals(DFPais.DINAMARCA, new DFPaisTransformer().read("2321"));
        Assert.assertEquals(DFPais.DOMINICA_ILHA, new DFPaisTransformer().read("2356"));
        Assert.assertEquals(DFPais.EQUADOR, new DFPaisTransformer().read("2399"));
        Assert.assertEquals(DFPais.EGITO, new DFPaisTransformer().read("2402"));
        Assert.assertEquals(DFPais.ERITREIA, new DFPaisTransformer().read("2437"));
        Assert.assertEquals(DFPais.EMIRADOS_ARABES_UNIDOS, new DFPaisTransformer().read("2445"));
        Assert.assertEquals(DFPais.ESPANHA, new DFPaisTransformer().read("2453"));
        Assert.assertEquals(DFPais.ESLOVENIA_REPUBLICA_DA, new DFPaisTransformer().read("2461"));
        Assert.assertEquals(DFPais.ESLOVACA_REPUBLICA, new DFPaisTransformer().read("2470"));
        Assert.assertEquals(DFPais.ESTADOS_UNIDOS, new DFPaisTransformer().read("2496"));
        Assert.assertEquals(DFPais.ESTONIA_REPUBLICA_DA, new DFPaisTransformer().read("2518"));
        Assert.assertEquals(DFPais.ETIOPIA, new DFPaisTransformer().read("2534"));
        Assert.assertEquals(DFPais.FALKLAND_ILHAS_MALVINAS, new DFPaisTransformer().read("2550"));
        Assert.assertEquals(DFPais.FEROE_ILHAS, new DFPaisTransformer().read("2593"));
        Assert.assertEquals(DFPais.FILIPINAS, new DFPaisTransformer().read("2674"));
        Assert.assertEquals(DFPais.FINLANDIA, new DFPaisTransformer().read("2712"));
        Assert.assertEquals(DFPais.FRANCA, new DFPaisTransformer().read("2755"));
        }

        @Test
	public void deveTestarLeitura5() throws Exception {
        Assert.assertEquals(DFPais.GABAO, new DFPaisTransformer().read("2810"));
        Assert.assertEquals(DFPais.GAMBIA, new DFPaisTransformer().read("2852"));
        Assert.assertEquals(DFPais.GANA, new DFPaisTransformer().read("2895"));
        Assert.assertEquals(DFPais.GEORGIA_REPUBLICA_DA, new DFPaisTransformer().read("2917"));
        Assert.assertEquals(DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL, new DFPaisTransformer().read("2925"));
        Assert.assertEquals(DFPais.GIBRALTAR, new DFPaisTransformer().read("2933"));
        Assert.assertEquals(DFPais.GRANADA, new DFPaisTransformer().read("2976"));
        Assert.assertEquals(DFPais.GRECIA, new DFPaisTransformer().read("3018"));
        Assert.assertEquals(DFPais.GROENLANDIA, new DFPaisTransformer().read("3050"));
        Assert.assertEquals(DFPais.GUADALUPE, new DFPaisTransformer().read("3093"));
        Assert.assertEquals(DFPais.GUAM, new DFPaisTransformer().read("3131"));
        Assert.assertEquals(DFPais.LEBUAN_ILHAS, new DFPaisTransformer().read("4235"));
        Assert.assertEquals(DFPais.LAOS_REP_POP_DEMOCR_DO, new DFPaisTransformer().read("4200"));
        Assert.assertEquals(DFPais.KIRIBATI, new DFPaisTransformer().read("4111"));
        Assert.assertEquals(DFPais.JORDANIA, new DFPaisTransformer().read("4030"));
        Assert.assertEquals(DFPais.JAPAO, new DFPaisTransformer().read("3999"));
        Assert.assertEquals(DFPais.JOHNSTON_ILHAS, new DFPaisTransformer().read("3964"));
        Assert.assertEquals(DFPais.JERSEY_ILHA_DO_CANAL, new DFPaisTransformer().read("3930"));
        Assert.assertEquals(DFPais.JAMAICA, new DFPaisTransformer().read("3913"));
        Assert.assertEquals(DFPais.ITALIA, new DFPaisTransformer().read("3867"));
        }

        @Test
	public void deveTestarLeitura6() throws Exception {
        Assert.assertEquals(DFPais.ISRAEL, new DFPaisTransformer().read("3832"));
        Assert.assertEquals(DFPais.ISLANDIA, new DFPaisTransformer().read("3794"));
        Assert.assertEquals(DFPais.IRLANDA, new DFPaisTransformer().read("3751"));
        Assert.assertEquals(DFPais.IRA_REPUBLICA_ISLAMICA_DO, new DFPaisTransformer().read("3727"));
        Assert.assertEquals(DFPais.IRAQUE, new DFPaisTransformer().read("3697"));
        Assert.assertEquals(DFPais.INDONESIA, new DFPaisTransformer().read("3654"));
        Assert.assertEquals(DFPais.INDIA, new DFPaisTransformer().read("3611"));
        Assert.assertEquals(DFPais.MAN_ILHA_DE, new DFPaisTransformer().read("3595"));
        Assert.assertEquals(DFPais.IEMEN, new DFPaisTransformer().read("3573"));
        Assert.assertEquals(DFPais.HUNGRIA_REPUBLICA_DA, new DFPaisTransformer().read("3557"));
        Assert.assertEquals(DFPais.HONG_KONG, new DFPaisTransformer().read("3514"));
        Assert.assertEquals(DFPais.HONDURAS, new DFPaisTransformer().read("3450"));
        Assert.assertEquals(DFPais.ILHA_HEARD_E_ILHAS_MCDONALD, new DFPaisTransformer().read("3433"));
        Assert.assertEquals(DFPais.HAITI, new DFPaisTransformer().read("3417"));
        Assert.assertEquals(DFPais.GUIANA, new DFPaisTransformer().read("3379"));
        Assert.assertEquals(DFPais.GUINE_BISSAU, new DFPaisTransformer().read("3344"));
        Assert.assertEquals(DFPais.GUINE_EQUATORIAL, new DFPaisTransformer().read("3310"));
        Assert.assertEquals(DFPais.GUINE, new DFPaisTransformer().read("3298"));
        Assert.assertEquals(DFPais.GUIANA_FRANCESA, new DFPaisTransformer().read("3255"));
        Assert.assertEquals(DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK, new DFPaisTransformer().read("3212"));
        }

        @Test
	public void deveTestarLeitura7() throws Exception {
        Assert.assertEquals(DFPais.GUATEMALA, new DFPaisTransformer().read("3174"));
        Assert.assertEquals(DFPais.LESOTO, new DFPaisTransformer().read("4260"));
        Assert.assertEquals(DFPais.LETONIA_REPUBLICA_DA, new DFPaisTransformer().read("4278"));
        Assert.assertEquals(DFPais.LIBANO, new DFPaisTransformer().read("4316"));
        Assert.assertEquals(DFPais.LIBERIA, new DFPaisTransformer().read("4340"));
        Assert.assertEquals(DFPais.LIBIA, new DFPaisTransformer().read("4383"));
        Assert.assertEquals(DFPais.LIECHTENSTEIN, new DFPaisTransformer().read("4405"));
        Assert.assertEquals(DFPais.LITUANIA_REPUBLICA_DA, new DFPaisTransformer().read("4421"));
        Assert.assertEquals(DFPais.LUXEMBURGO, new DFPaisTransformer().read("4456"));
        Assert.assertEquals(DFPais.MACAU, new DFPaisTransformer().read("4472"));
        Assert.assertEquals(DFPais.MACEDONIA_ANT_REP_IUGOSLAVA, new DFPaisTransformer().read("4499"));
        Assert.assertEquals(DFPais.MADAGASCAR, new DFPaisTransformer().read("4502"));
        Assert.assertEquals(DFPais.MADEIRA_ILHA_DA, new DFPaisTransformer().read("4525"));
        Assert.assertEquals(DFPais.MALASIA, new DFPaisTransformer().read("4553"));
        Assert.assertEquals(DFPais.MALAVI, new DFPaisTransformer().read("4588"));
        Assert.assertEquals(DFPais.MALDIVAS, new DFPaisTransformer().read("4618"));
        Assert.assertEquals(DFPais.MALI, new DFPaisTransformer().read("4642"));
        Assert.assertEquals(DFPais.MALTA, new DFPaisTransformer().read("4677"));
        Assert.assertEquals(DFPais.MARIANAS_DO_NORTE, new DFPaisTransformer().read("4723"));
        Assert.assertEquals(DFPais.MARROCOS, new DFPaisTransformer().read("4740"));
        }

        @Test
	public void deveTestarLeitura8() throws Exception {
        Assert.assertEquals(DFPais.MARSHALL_ILHAS, new DFPaisTransformer().read("4766"));
        Assert.assertEquals(DFPais.MARTINICA, new DFPaisTransformer().read("4774"));
        Assert.assertEquals(DFPais.MAURICIO, new DFPaisTransformer().read("4855"));
        Assert.assertEquals(DFPais.MAURITANIA, new DFPaisTransformer().read("4880"));
        Assert.assertEquals(DFPais.MAYOTTE_ILHAS_FRANCESAS, new DFPaisTransformer().read("4898"));
        Assert.assertEquals(DFPais.MIDWAY_ILHAS, new DFPaisTransformer().read("4901"));
        Assert.assertEquals(DFPais.MEXICO, new DFPaisTransformer().read("4936"));
        Assert.assertEquals(DFPais.MOLDAVIA_REPUBLICA_DA, new DFPaisTransformer().read("4944"));
        Assert.assertEquals(DFPais.MONACO, new DFPaisTransformer().read("4952"));
        Assert.assertEquals(DFPais.MONGOLIA, new DFPaisTransformer().read("4979"));
        Assert.assertEquals(DFPais.MONTENEGRO, new DFPaisTransformer().read("4985"));
        Assert.assertEquals(DFPais.MICRONESIA, new DFPaisTransformer().read("4995"));
        Assert.assertEquals(DFPais.MONTSERRAT_ILHAS, new DFPaisTransformer().read("5010"));
        Assert.assertEquals(DFPais.MOCAMBIQUE, new DFPaisTransformer().read("5053"));
        Assert.assertEquals(DFPais.NAMIBIA, new DFPaisTransformer().read("5070"));
        Assert.assertEquals(DFPais.NAURU, new DFPaisTransformer().read("5088"));
        Assert.assertEquals(DFPais.CHRISTMAS_ILHA_NAVIDAD, new DFPaisTransformer().read("5118"));
        Assert.assertEquals(DFPais.NEPAL, new DFPaisTransformer().read("5177"));
        Assert.assertEquals(DFPais.NICARAGUA, new DFPaisTransformer().read("5215"));
        Assert.assertEquals(DFPais.NIGER, new DFPaisTransformer().read("5258"));
        }

        @Test
	public void deveTestarLeitura9() throws Exception {
        Assert.assertEquals(DFPais.NIGERIA, new DFPaisTransformer().read("5282"));
        Assert.assertEquals(DFPais.NIUE_ILHA, new DFPaisTransformer().read("5312"));
        Assert.assertEquals(DFPais.NORFOLK_ILHA, new DFPaisTransformer().read("5355"));
        Assert.assertEquals(DFPais.NORUEGA, new DFPaisTransformer().read("5380"));
        Assert.assertEquals(DFPais.NOVA_CALEDONIA, new DFPaisTransformer().read("5428"));
        Assert.assertEquals(DFPais.PAPUA_NOVA_GUINE, new DFPaisTransformer().read("5452"));
        Assert.assertEquals(DFPais.NOVA_ZELANDIA, new DFPaisTransformer().read("5487"));
        Assert.assertEquals(DFPais.VANUATU, new DFPaisTransformer().read("5517"));
        Assert.assertEquals(DFPais.OMA, new DFPaisTransformer().read("5568"));
        Assert.assertEquals(DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA, new DFPaisTransformer().read("5665"));
        Assert.assertEquals(DFPais.PAISES_BAIXOS_HOLANDA, new DFPaisTransformer().read("5738"));
        Assert.assertEquals(DFPais.PALAU, new DFPaisTransformer().read("5754"));
        Assert.assertEquals(DFPais.PAQUISTAO, new DFPaisTransformer().read("5762"));
        Assert.assertEquals(DFPais.PALESTINA, new DFPaisTransformer().read("5780"));
        Assert.assertEquals(DFPais.PANAMA, new DFPaisTransformer().read("5800"));
        Assert.assertEquals(DFPais.PARAGUAI, new DFPaisTransformer().read("5860"));
        Assert.assertEquals(DFPais.PERU, new DFPaisTransformer().read("5894"));
        Assert.assertEquals(DFPais.PITCAIRN_ILHA, new DFPaisTransformer().read("5932"));
        Assert.assertEquals(DFPais.POLINESIA_FRANCESA, new DFPaisTransformer().read("5991"));
        Assert.assertEquals(DFPais.POLONIA_REPUBLICA_DA, new DFPaisTransformer().read("6033"));
        }

        @Test
	public void deveTestarLeitura10() throws Exception {
        Assert.assertEquals(DFPais.PORTUGAL, new DFPaisTransformer().read("6076"));
        Assert.assertEquals(DFPais.PORTO_RICO, new DFPaisTransformer().read("6114"));
        Assert.assertEquals(DFPais.QUENIA, new DFPaisTransformer().read("6238"));
        Assert.assertEquals(DFPais.QUIRGUIZ_REPUBLICA, new DFPaisTransformer().read("6254"));
        Assert.assertEquals(DFPais.REINO_UNIDO, new DFPaisTransformer().read("6289"));
        Assert.assertEquals(DFPais.REPUBLICA_CENTRO_AFRICANA, new DFPaisTransformer().read("6408"));
        Assert.assertEquals(DFPais.REPUBLICA_DOMINICANA, new DFPaisTransformer().read("6475"));
        Assert.assertEquals(DFPais.REUNIAO_ILHA, new DFPaisTransformer().read("6602"));
        Assert.assertEquals(DFPais.ZIMBABUE, new DFPaisTransformer().read("6653"));
        Assert.assertEquals(DFPais.ROMENIA, new DFPaisTransformer().read("6700"));
        Assert.assertEquals(DFPais.RUANDA, new DFPaisTransformer().read("6750"));
        Assert.assertEquals(DFPais.RUSSIA_FEDERACAO_DA, new DFPaisTransformer().read("6769"));
        Assert.assertEquals(DFPais.SALOMAO_ILHAS, new DFPaisTransformer().read("6777"));
        Assert.assertEquals(DFPais.SAARA_OCIDENTAL, new DFPaisTransformer().read("6858"));
        Assert.assertEquals(DFPais.EL_SALVADOR, new DFPaisTransformer().read("6874"));
        Assert.assertEquals(DFPais.SAMOA, new DFPaisTransformer().read("6904"));
        Assert.assertEquals(DFPais.SAMOA_AMERICANA, new DFPaisTransformer().read("6912"));
        Assert.assertEquals(DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS, new DFPaisTransformer().read("6955"));
        Assert.assertEquals(DFPais.SAO_BARTOLOMEU, new DFPaisTransformer().read("6939"));
        Assert.assertEquals(DFPais.SAN_MARINO, new DFPaisTransformer().read("6971"));
        }

        @Test
	public void deveTestarLeitura11() throws Exception {
        Assert.assertEquals(DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA, new DFPaisTransformer().read("6980"));
        Assert.assertEquals(DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA, new DFPaisTransformer().read("6998"));
        Assert.assertEquals(DFPais.SAO_PEDRO_E_MIQUELON, new DFPaisTransformer().read("7005"));
        Assert.assertEquals(DFPais.SAO_VICENTE_E_GRANADINAS, new DFPaisTransformer().read("7056"));
        Assert.assertEquals(DFPais.SANTA_HELENA, new DFPaisTransformer().read("7102"));
        Assert.assertEquals(DFPais.SANTA_LUCIA, new DFPaisTransformer().read("7153"));
        Assert.assertEquals(DFPais.SAO_TOME_E_PRINCIPE_ILHAS, new DFPaisTransformer().read("7200"));
        Assert.assertEquals(DFPais.SENEGAL, new DFPaisTransformer().read("7285"));
        Assert.assertEquals(DFPais.SEYCHELLES, new DFPaisTransformer().read("7315"));
        Assert.assertEquals(DFPais.SERRA_LEOA, new DFPaisTransformer().read("7358"));
        Assert.assertEquals(DFPais.SERVIA, new DFPaisTransformer().read("7370"));
        Assert.assertEquals(DFPais.CINGAPURA, new DFPaisTransformer().read("7412"));
        Assert.assertEquals(DFPais.SIRIA_REPUBLICA_ARABE_DA, new DFPaisTransformer().read("7447"));
        Assert.assertEquals(DFPais.SOMALIA, new DFPaisTransformer().read("7480"));
        Assert.assertEquals(DFPais.SRI_LANKA, new DFPaisTransformer().read("7501"));
        Assert.assertEquals(DFPais.SUAZILANDIA, new DFPaisTransformer().read("7544"));
        Assert.assertEquals(DFPais.SVALBARD_E_JAN_MAYERN, new DFPaisTransformer().read("7552"));
        Assert.assertEquals(DFPais.AFRICA_DO_SUL, new DFPaisTransformer().read("7560"));
        Assert.assertEquals(DFPais.SUDAO, new DFPaisTransformer().read("7595"));
        Assert.assertEquals(DFPais.SUD_O_DO_SUL, new DFPaisTransformer().read("7600"));
        }

        @Test
	public void deveTestarLeitura12() throws Exception {
        Assert.assertEquals(DFPais.SUECIA, new DFPaisTransformer().read("7641"));
        Assert.assertEquals(DFPais.SUICA, new DFPaisTransformer().read("7676"));
        Assert.assertEquals(DFPais.SURINAME, new DFPaisTransformer().read("7706"));
        Assert.assertEquals(DFPais.TADJIQUISTAO_REPUBLICA_DO, new DFPaisTransformer().read("7722"));
        Assert.assertEquals(DFPais.TAILANDIA, new DFPaisTransformer().read("7765"));
        Assert.assertEquals(DFPais.TANZANIA_REP_UNIDA_DA, new DFPaisTransformer().read("7803"));
        Assert.assertEquals(DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS, new DFPaisTransformer().read("7811"));
        Assert.assertEquals(DFPais.TERRITORIO_BRIT_OC_INDICO, new DFPaisTransformer().read("7820"));
        Assert.assertEquals(DFPais.DJIBUTI, new DFPaisTransformer().read("7838"));
        Assert.assertEquals(DFPais.CHADE, new DFPaisTransformer().read("7889"));
        Assert.assertEquals(DFPais.TCHECA_REPUBLICA, new DFPaisTransformer().read("7919"));
        Assert.assertEquals(DFPais.TIMOR_LESTE, new DFPaisTransformer().read("7951"));
        Assert.assertEquals(DFPais.TOGO, new DFPaisTransformer().read("8001"));
        Assert.assertEquals(DFPais.TOQUELAU_ILHAS, new DFPaisTransformer().read("8052"));
        Assert.assertEquals(DFPais.TONGA, new DFPaisTransformer().read("8109"));
        Assert.assertEquals(DFPais.TRINIDAD_E_TOBAGO, new DFPaisTransformer().read("8150"));
        Assert.assertEquals(DFPais.TUNISIA, new DFPaisTransformer().read("8206"));
        Assert.assertEquals(DFPais.TURCAS_E_CAICOS_ILHAS, new DFPaisTransformer().read("8230"));
        Assert.assertEquals(DFPais.TURCOMENISTAO_REPUBLICA_DO, new DFPaisTransformer().read("8249"));
        Assert.assertEquals(DFPais.TURQUIA, new DFPaisTransformer().read("8273"));
        }

        @Test
	public void deveTestarLeitura13() throws Exception {
        Assert.assertEquals(DFPais.TUVALU, new DFPaisTransformer().read("8281"));
        Assert.assertEquals(DFPais.UCRANIA, new DFPaisTransformer().read("8311"));
        Assert.assertEquals(DFPais.UGANDA, new DFPaisTransformer().read("8338"));
        Assert.assertEquals(DFPais.URUGUAI, new DFPaisTransformer().read("8451"));
        Assert.assertEquals(DFPais.UZBEQUISTAO_REPUBLICA_DO, new DFPaisTransformer().read("8478"));
        Assert.assertEquals(DFPais.VATICANO_EST_DA_CIDADE_DO, new DFPaisTransformer().read("8486"));
        Assert.assertEquals(DFPais.VENEZUELA, new DFPaisTransformer().read("8508"));
        Assert.assertEquals(DFPais.VIETNA, new DFPaisTransformer().read("8583"));
        Assert.assertEquals(DFPais.VIRGENS_ILHAS_BRITANICAS, new DFPaisTransformer().read("8630"));
        Assert.assertEquals(DFPais.VIRGENS_ILHAS_E_U_A, new DFPaisTransformer().read("8664"));
        Assert.assertEquals(DFPais.FIJI, new DFPaisTransformer().read("8702"));
        Assert.assertEquals(DFPais.WALLIS_E_FUTUNA_ILHAS, new DFPaisTransformer().read("8753"));
        Assert.assertEquals(DFPais.WAKE_ILHA, new DFPaisTransformer().read("8737"));
        Assert.assertEquals(DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO, new DFPaisTransformer().read("8885"));
        Assert.assertEquals(DFPais.ZAMBIA, new DFPaisTransformer().read("8907"));
        }




        @Test
	public void deveTestarEscrita1() throws Exception {
        Assert.assertEquals("132", new DFPaisTransformer().write(DFPais.AFEGANISTAO));
        Assert.assertEquals("153", new DFPaisTransformer().write(DFPais.ALAND_ILHAS));
        Assert.assertEquals("175", new DFPaisTransformer().write(DFPais.ALBANIA_REPUBLICA_DA));
        Assert.assertEquals("230", new DFPaisTransformer().write(DFPais.ALEMANHA));
        Assert.assertEquals("310", new DFPaisTransformer().write(DFPais.BURKINA_FASO));
        Assert.assertEquals("370", new DFPaisTransformer().write(DFPais.ANDORRA));
        Assert.assertEquals("400", new DFPaisTransformer().write(DFPais.ANGOLA));
        Assert.assertEquals("418", new DFPaisTransformer().write(DFPais.ANGUILLA));
        Assert.assertEquals("420", new DFPaisTransformer().write(DFPais.ANTARTICA));
        Assert.assertEquals("434", new DFPaisTransformer().write(DFPais.ANTIGUA_E_BARBUDA));
        Assert.assertEquals("477", new DFPaisTransformer().write(DFPais.ANTILHAS_HOLANDESAS));
        Assert.assertEquals("531", new DFPaisTransformer().write(DFPais.ARABIA_SAUDITA));
        Assert.assertEquals("590", new DFPaisTransformer().write(DFPais.ARGELIA));
        Assert.assertEquals("639", new DFPaisTransformer().write(DFPais.ARGENTINA));
        Assert.assertEquals("647", new DFPaisTransformer().write(DFPais.ARMENIA_REPUBLICA_DA));
        Assert.assertEquals("655", new DFPaisTransformer().write(DFPais.ARUBA));
        Assert.assertEquals("698", new DFPaisTransformer().write(DFPais.AUSTRALIA));
        Assert.assertEquals("728", new DFPaisTransformer().write(DFPais.AUSTRIA));
        Assert.assertEquals("736", new DFPaisTransformer().write(DFPais.AZERBAIJAO_REPUBLICA_DO));
        Assert.assertEquals("779", new DFPaisTransformer().write(DFPais.BAHAMAS_ILHAS));
        }

        @Test
	public void deveTestarEscrita2() throws Exception {
        Assert.assertEquals("809", new DFPaisTransformer().write(DFPais.BAHREIN_ILHAS));
        Assert.assertEquals("817", new DFPaisTransformer().write(DFPais.BANGLADESH));
        Assert.assertEquals("833", new DFPaisTransformer().write(DFPais.BARBADOS));
        Assert.assertEquals("850", new DFPaisTransformer().write(DFPais.BELARUS_REPUBLICA_DA));
        Assert.assertEquals("876", new DFPaisTransformer().write(DFPais.BELGICA));
        Assert.assertEquals("884", new DFPaisTransformer().write(DFPais.BELIZE));
        Assert.assertEquals("906", new DFPaisTransformer().write(DFPais.BERMUDAS));
        Assert.assertEquals("930", new DFPaisTransformer().write(DFPais.MIANMAR_BIRMANIA));
        Assert.assertEquals("973", new DFPaisTransformer().write(DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA));
        Assert.assertEquals("981", new DFPaisTransformer().write(DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA));
        Assert.assertEquals("990", new DFPaisTransformer().write(DFPais.BONAIRE));
        Assert.assertEquals("1015", new DFPaisTransformer().write(DFPais.BOTSUANA));
        Assert.assertEquals("1023", new DFPaisTransformer().write(DFPais.BOUVET_ILHA));
        Assert.assertEquals("1058", new DFPaisTransformer().write(DFPais.BRASIL));
        Assert.assertEquals("1082", new DFPaisTransformer().write(DFPais.BRUNEI));
        Assert.assertEquals("1112", new DFPaisTransformer().write(DFPais.BULGARIA_REPUBLICA_DA));
        Assert.assertEquals("1155", new DFPaisTransformer().write(DFPais.BURUNDI));
        Assert.assertEquals("1198", new DFPaisTransformer().write(DFPais.BUTAO));
        Assert.assertEquals("1279", new DFPaisTransformer().write(DFPais.CABO_VERDE_REPUBLICA_DE));
        Assert.assertEquals("1376", new DFPaisTransformer().write(DFPais.CAYMAN_ILHAS));
        }

        @Test
	public void deveTestarEscrita3() throws Exception {
        Assert.assertEquals("1414", new DFPaisTransformer().write(DFPais.CAMBOJA));
        Assert.assertEquals("1457", new DFPaisTransformer().write(DFPais.CAMAROES));
        Assert.assertEquals("1490", new DFPaisTransformer().write(DFPais.CANADA));
        Assert.assertEquals("1538", new DFPaisTransformer().write(DFPais.CAZAQUISTAO_REPUBLICA_DO));
        Assert.assertEquals("1546", new DFPaisTransformer().write(DFPais.CATAR));
        Assert.assertEquals("1589", new DFPaisTransformer().write(DFPais.CHILE));
        Assert.assertEquals("1600", new DFPaisTransformer().write(DFPais.CHINA_REPUBLICA_POPULAR));
        Assert.assertEquals("1619", new DFPaisTransformer().write(DFPais.FORMOSA_TAIWAN));
        Assert.assertEquals("1635", new DFPaisTransformer().write(DFPais.CHIPRE));
        Assert.assertEquals("1651", new DFPaisTransformer().write(DFPais.COCOS_KEELING_ILHAS));
        Assert.assertEquals("1694", new DFPaisTransformer().write(DFPais.COLOMBIA));
        Assert.assertEquals("1732", new DFPaisTransformer().write(DFPais.COMORES_ILHAS));
        Assert.assertEquals("1775", new DFPaisTransformer().write(DFPais.CONGO));
        Assert.assertEquals("1830", new DFPaisTransformer().write(DFPais.COOK_ILHAS));
        Assert.assertEquals("1872", new DFPaisTransformer().write(DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA));
        Assert.assertEquals("1902", new DFPaisTransformer().write(DFPais.COREIA_DO_SUL_REPUBLICA_DA));
        Assert.assertEquals("1937", new DFPaisTransformer().write(DFPais.COSTA_DO_MARFIM));
        Assert.assertEquals("1953", new DFPaisTransformer().write(DFPais.CROACIA_REPUBLICA_DA));
        Assert.assertEquals("1961", new DFPaisTransformer().write(DFPais.COSTA_RICA));
        Assert.assertEquals("1988", new DFPaisTransformer().write(DFPais.KUWAIT));
        }

        @Test
	public void deveTestarEscrita4() throws Exception {
        Assert.assertEquals("1996", new DFPaisTransformer().write(DFPais.CUBA));
        Assert.assertEquals("2003", new DFPaisTransformer().write(DFPais.CURACAO));
        Assert.assertEquals("2291", new DFPaisTransformer().write(DFPais.BENIN));
        Assert.assertEquals("2321", new DFPaisTransformer().write(DFPais.DINAMARCA));
        Assert.assertEquals("2356", new DFPaisTransformer().write(DFPais.DOMINICA_ILHA));
        Assert.assertEquals("2399", new DFPaisTransformer().write(DFPais.EQUADOR));
        Assert.assertEquals("2402", new DFPaisTransformer().write(DFPais.EGITO));
        Assert.assertEquals("2437", new DFPaisTransformer().write(DFPais.ERITREIA));
        Assert.assertEquals("2445", new DFPaisTransformer().write(DFPais.EMIRADOS_ARABES_UNIDOS));
        Assert.assertEquals("2453", new DFPaisTransformer().write(DFPais.ESPANHA));
        Assert.assertEquals("2461", new DFPaisTransformer().write(DFPais.ESLOVENIA_REPUBLICA_DA));
        Assert.assertEquals("2470", new DFPaisTransformer().write(DFPais.ESLOVACA_REPUBLICA));
        Assert.assertEquals("2496", new DFPaisTransformer().write(DFPais.ESTADOS_UNIDOS));
        Assert.assertEquals("2518", new DFPaisTransformer().write(DFPais.ESTONIA_REPUBLICA_DA));
        Assert.assertEquals("2534", new DFPaisTransformer().write(DFPais.ETIOPIA));
        Assert.assertEquals("2550", new DFPaisTransformer().write(DFPais.FALKLAND_ILHAS_MALVINAS));
        Assert.assertEquals("2593", new DFPaisTransformer().write(DFPais.FEROE_ILHAS));
        Assert.assertEquals("2674", new DFPaisTransformer().write(DFPais.FILIPINAS));
        Assert.assertEquals("2712", new DFPaisTransformer().write(DFPais.FINLANDIA));
        Assert.assertEquals("2755", new DFPaisTransformer().write(DFPais.FRANCA));
        }

        @Test
	public void deveTestarEscrita5() throws Exception {
        Assert.assertEquals("2810", new DFPaisTransformer().write(DFPais.GABAO));
        Assert.assertEquals("2852", new DFPaisTransformer().write(DFPais.GAMBIA));
        Assert.assertEquals("2895", new DFPaisTransformer().write(DFPais.GANA));
        Assert.assertEquals("2917", new DFPaisTransformer().write(DFPais.GEORGIA_REPUBLICA_DA));
        Assert.assertEquals("2925", new DFPaisTransformer().write(DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL));
        Assert.assertEquals("2933", new DFPaisTransformer().write(DFPais.GIBRALTAR));
        Assert.assertEquals("2976", new DFPaisTransformer().write(DFPais.GRANADA));
        Assert.assertEquals("3018", new DFPaisTransformer().write(DFPais.GRECIA));
        Assert.assertEquals("3050", new DFPaisTransformer().write(DFPais.GROENLANDIA));
        Assert.assertEquals("3093", new DFPaisTransformer().write(DFPais.GUADALUPE));
        Assert.assertEquals("3131", new DFPaisTransformer().write(DFPais.GUAM));
        Assert.assertEquals("3174", new DFPaisTransformer().write(DFPais.GUATEMALA));
        Assert.assertEquals("3212", new DFPaisTransformer().write(DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK));
        Assert.assertEquals("3255", new DFPaisTransformer().write(DFPais.GUIANA_FRANCESA));
        Assert.assertEquals("3298", new DFPaisTransformer().write(DFPais.GUINE));
        Assert.assertEquals("3310", new DFPaisTransformer().write(DFPais.GUINE_EQUATORIAL));
        Assert.assertEquals("3344", new DFPaisTransformer().write(DFPais.GUINE_BISSAU));
        Assert.assertEquals("3379", new DFPaisTransformer().write(DFPais.GUIANA));
        Assert.assertEquals("3417", new DFPaisTransformer().write(DFPais.HAITI));
        Assert.assertEquals("3433", new DFPaisTransformer().write(DFPais.ILHA_HEARD_E_ILHAS_MCDONALD));
        }

        @Test
	public void deveTestarEscrita6() throws Exception {
        Assert.assertEquals("3450", new DFPaisTransformer().write(DFPais.HONDURAS));
        Assert.assertEquals("3514", new DFPaisTransformer().write(DFPais.HONG_KONG));
        Assert.assertEquals("3557", new DFPaisTransformer().write(DFPais.HUNGRIA_REPUBLICA_DA));
        Assert.assertEquals("3573", new DFPaisTransformer().write(DFPais.IEMEN));
        Assert.assertEquals("3595", new DFPaisTransformer().write(DFPais.MAN_ILHA_DE));
        Assert.assertEquals("3611", new DFPaisTransformer().write(DFPais.INDIA));
        Assert.assertEquals("3654", new DFPaisTransformer().write(DFPais.INDONESIA));
        Assert.assertEquals("3697", new DFPaisTransformer().write(DFPais.IRAQUE));
        Assert.assertEquals("3727", new DFPaisTransformer().write(DFPais.IRA_REPUBLICA_ISLAMICA_DO));
        Assert.assertEquals("3751", new DFPaisTransformer().write(DFPais.IRLANDA));
        Assert.assertEquals("3794", new DFPaisTransformer().write(DFPais.ISLANDIA));
        Assert.assertEquals("3832", new DFPaisTransformer().write(DFPais.ISRAEL));
        Assert.assertEquals("3867", new DFPaisTransformer().write(DFPais.ITALIA));
        Assert.assertEquals("3913", new DFPaisTransformer().write(DFPais.JAMAICA));
        Assert.assertEquals("3930", new DFPaisTransformer().write(DFPais.JERSEY_ILHA_DO_CANAL));
        Assert.assertEquals("3964", new DFPaisTransformer().write(DFPais.JOHNSTON_ILHAS));
        Assert.assertEquals("3999", new DFPaisTransformer().write(DFPais.JAPAO));
        Assert.assertEquals("4030", new DFPaisTransformer().write(DFPais.JORDANIA));
        Assert.assertEquals("4111", new DFPaisTransformer().write(DFPais.KIRIBATI));
        Assert.assertEquals("4200", new DFPaisTransformer().write(DFPais.LAOS_REP_POP_DEMOCR_DO));
        }

        @Test
	public void deveTestarEscrita7() throws Exception {
        Assert.assertEquals("4235", new DFPaisTransformer().write(DFPais.LEBUAN_ILHAS));
        Assert.assertEquals("4260", new DFPaisTransformer().write(DFPais.LESOTO));
        Assert.assertEquals("4278", new DFPaisTransformer().write(DFPais.LETONIA_REPUBLICA_DA));
        Assert.assertEquals("4316", new DFPaisTransformer().write(DFPais.LIBANO));
        Assert.assertEquals("4340", new DFPaisTransformer().write(DFPais.LIBERIA));
        Assert.assertEquals("4383", new DFPaisTransformer().write(DFPais.LIBIA));
        Assert.assertEquals("4405", new DFPaisTransformer().write(DFPais.LIECHTENSTEIN));
        Assert.assertEquals("4421", new DFPaisTransformer().write(DFPais.LITUANIA_REPUBLICA_DA));
        Assert.assertEquals("4456", new DFPaisTransformer().write(DFPais.LUXEMBURGO));
        Assert.assertEquals("4472", new DFPaisTransformer().write(DFPais.MACAU));
        Assert.assertEquals("4499", new DFPaisTransformer().write(DFPais.MACEDONIA_ANT_REP_IUGOSLAVA));
        Assert.assertEquals("4502", new DFPaisTransformer().write(DFPais.MADAGASCAR));
        Assert.assertEquals("4525", new DFPaisTransformer().write(DFPais.MADEIRA_ILHA_DA));
        Assert.assertEquals("4553", new DFPaisTransformer().write(DFPais.MALASIA));
        Assert.assertEquals("4588", new DFPaisTransformer().write(DFPais.MALAVI));
        Assert.assertEquals("4618", new DFPaisTransformer().write(DFPais.MALDIVAS));
        Assert.assertEquals("4642", new DFPaisTransformer().write(DFPais.MALI));
        Assert.assertEquals("4677", new DFPaisTransformer().write(DFPais.MALTA));
        Assert.assertEquals("4723", new DFPaisTransformer().write(DFPais.MARIANAS_DO_NORTE));
        Assert.assertEquals("4740", new DFPaisTransformer().write(DFPais.MARROCOS));
        }

        @Test
	public void deveTestarEscrita8() throws Exception {
        Assert.assertEquals("4766", new DFPaisTransformer().write(DFPais.MARSHALL_ILHAS));
        Assert.assertEquals("4774", new DFPaisTransformer().write(DFPais.MARTINICA));
        Assert.assertEquals("4855", new DFPaisTransformer().write(DFPais.MAURICIO));
        Assert.assertEquals("4880", new DFPaisTransformer().write(DFPais.MAURITANIA));
        Assert.assertEquals("4898", new DFPaisTransformer().write(DFPais.MAYOTTE_ILHAS_FRANCESAS));
        Assert.assertEquals("4901", new DFPaisTransformer().write(DFPais.MIDWAY_ILHAS));
        Assert.assertEquals("4936", new DFPaisTransformer().write(DFPais.MEXICO));
        Assert.assertEquals("4944", new DFPaisTransformer().write(DFPais.MOLDAVIA_REPUBLICA_DA));
        Assert.assertEquals("4952", new DFPaisTransformer().write(DFPais.MONACO));
        Assert.assertEquals("4979", new DFPaisTransformer().write(DFPais.MONGOLIA));
        Assert.assertEquals("4985", new DFPaisTransformer().write(DFPais.MONTENEGRO));
        Assert.assertEquals("4995", new DFPaisTransformer().write(DFPais.MICRONESIA));
        Assert.assertEquals("5010", new DFPaisTransformer().write(DFPais.MONTSERRAT_ILHAS));
        Assert.assertEquals("5053", new DFPaisTransformer().write(DFPais.MOCAMBIQUE));
        Assert.assertEquals("5070", new DFPaisTransformer().write(DFPais.NAMIBIA));
        Assert.assertEquals("5088", new DFPaisTransformer().write(DFPais.NAURU));
        Assert.assertEquals("5118", new DFPaisTransformer().write(DFPais.CHRISTMAS_ILHA_NAVIDAD));
        Assert.assertEquals("5177", new DFPaisTransformer().write(DFPais.NEPAL));
        Assert.assertEquals("5215", new DFPaisTransformer().write(DFPais.NICARAGUA));
        Assert.assertEquals("5258", new DFPaisTransformer().write(DFPais.NIGER));
        }

        @Test
	public void deveTestarEscrita9() throws Exception {
        Assert.assertEquals("5282", new DFPaisTransformer().write(DFPais.NIGERIA));
        Assert.assertEquals("5312", new DFPaisTransformer().write(DFPais.NIUE_ILHA));
        Assert.assertEquals("5355", new DFPaisTransformer().write(DFPais.NORFOLK_ILHA));
        Assert.assertEquals("5380", new DFPaisTransformer().write(DFPais.NORUEGA));
        Assert.assertEquals("5428", new DFPaisTransformer().write(DFPais.NOVA_CALEDONIA));
        Assert.assertEquals("5452", new DFPaisTransformer().write(DFPais.PAPUA_NOVA_GUINE));
        Assert.assertEquals("5487", new DFPaisTransformer().write(DFPais.NOVA_ZELANDIA));
        Assert.assertEquals("5517", new DFPaisTransformer().write(DFPais.VANUATU));
        Assert.assertEquals("5568", new DFPaisTransformer().write(DFPais.OMA));
        Assert.assertEquals("5665", new DFPaisTransformer().write(DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA));
        Assert.assertEquals("5738", new DFPaisTransformer().write(DFPais.PAISES_BAIXOS_HOLANDA));
        Assert.assertEquals("5754", new DFPaisTransformer().write(DFPais.PALAU));
        Assert.assertEquals("5762", new DFPaisTransformer().write(DFPais.PAQUISTAO));
        Assert.assertEquals("5780", new DFPaisTransformer().write(DFPais.PALESTINA));
        Assert.assertEquals("5800", new DFPaisTransformer().write(DFPais.PANAMA));
        Assert.assertEquals("5860", new DFPaisTransformer().write(DFPais.PARAGUAI));
        Assert.assertEquals("5894", new DFPaisTransformer().write(DFPais.PERU));
        Assert.assertEquals("5932", new DFPaisTransformer().write(DFPais.PITCAIRN_ILHA));
        Assert.assertEquals("5991", new DFPaisTransformer().write(DFPais.POLINESIA_FRANCESA));
        Assert.assertEquals("6033", new DFPaisTransformer().write(DFPais.POLONIA_REPUBLICA_DA));
        }

        @Test
	public void deveTestarEscrita10() throws Exception {
        Assert.assertEquals("6076", new DFPaisTransformer().write(DFPais.PORTUGAL));
        Assert.assertEquals("6114", new DFPaisTransformer().write(DFPais.PORTO_RICO));
        Assert.assertEquals("6238", new DFPaisTransformer().write(DFPais.QUENIA));
        Assert.assertEquals("6254", new DFPaisTransformer().write(DFPais.QUIRGUIZ_REPUBLICA));
        Assert.assertEquals("6289", new DFPaisTransformer().write(DFPais.REINO_UNIDO));
        Assert.assertEquals("6408", new DFPaisTransformer().write(DFPais.REPUBLICA_CENTRO_AFRICANA));
        Assert.assertEquals("6475", new DFPaisTransformer().write(DFPais.REPUBLICA_DOMINICANA));
        Assert.assertEquals("6602", new DFPaisTransformer().write(DFPais.REUNIAO_ILHA));
        Assert.assertEquals("6653", new DFPaisTransformer().write(DFPais.ZIMBABUE));
        Assert.assertEquals("6700", new DFPaisTransformer().write(DFPais.ROMENIA));
        Assert.assertEquals("6750", new DFPaisTransformer().write(DFPais.RUANDA));
        Assert.assertEquals("6769", new DFPaisTransformer().write(DFPais.RUSSIA_FEDERACAO_DA));
        Assert.assertEquals("6777", new DFPaisTransformer().write(DFPais.SALOMAO_ILHAS));
        Assert.assertEquals("6858", new DFPaisTransformer().write(DFPais.SAARA_OCIDENTAL));
        Assert.assertEquals("6874", new DFPaisTransformer().write(DFPais.EL_SALVADOR));
        Assert.assertEquals("6904", new DFPaisTransformer().write(DFPais.SAMOA));
        Assert.assertEquals("6912", new DFPaisTransformer().write(DFPais.SAMOA_AMERICANA));
        Assert.assertEquals("6955", new DFPaisTransformer().write(DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS));
        Assert.assertEquals("6939", new DFPaisTransformer().write(DFPais.SAO_BARTOLOMEU));
        Assert.assertEquals("6971", new DFPaisTransformer().write(DFPais.SAN_MARINO));
        }

        @Test
	public void deveTestarEscrita11() throws Exception {
        Assert.assertEquals("6980", new DFPaisTransformer().write(DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA));
        Assert.assertEquals("6998", new DFPaisTransformer().write(DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA));
        Assert.assertEquals("7005", new DFPaisTransformer().write(DFPais.SAO_PEDRO_E_MIQUELON));
        Assert.assertEquals("7056", new DFPaisTransformer().write(DFPais.SAO_VICENTE_E_GRANADINAS));
        Assert.assertEquals("7102", new DFPaisTransformer().write(DFPais.SANTA_HELENA));
        Assert.assertEquals("7153", new DFPaisTransformer().write(DFPais.SANTA_LUCIA));
        Assert.assertEquals("7200", new DFPaisTransformer().write(DFPais.SAO_TOME_E_PRINCIPE_ILHAS));
        Assert.assertEquals("7285", new DFPaisTransformer().write(DFPais.SENEGAL));
        Assert.assertEquals("7315", new DFPaisTransformer().write(DFPais.SEYCHELLES));
        Assert.assertEquals("7358", new DFPaisTransformer().write(DFPais.SERRA_LEOA));
        Assert.assertEquals("7370", new DFPaisTransformer().write(DFPais.SERVIA));
        Assert.assertEquals("7412", new DFPaisTransformer().write(DFPais.CINGAPURA));
        Assert.assertEquals("7447", new DFPaisTransformer().write(DFPais.SIRIA_REPUBLICA_ARABE_DA));
        Assert.assertEquals("7480", new DFPaisTransformer().write(DFPais.SOMALIA));
        Assert.assertEquals("7501", new DFPaisTransformer().write(DFPais.SRI_LANKA));
        Assert.assertEquals("7544", new DFPaisTransformer().write(DFPais.SUAZILANDIA));
        Assert.assertEquals("7552", new DFPaisTransformer().write(DFPais.SVALBARD_E_JAN_MAYERN));
        Assert.assertEquals("7560", new DFPaisTransformer().write(DFPais.AFRICA_DO_SUL));
        Assert.assertEquals("7595", new DFPaisTransformer().write(DFPais.SUDAO));
        Assert.assertEquals("7600", new DFPaisTransformer().write(DFPais.SUD_O_DO_SUL));
        }

        @Test
	public void deveTestarEscrita12() throws Exception {
        Assert.assertEquals("7641", new DFPaisTransformer().write(DFPais.SUECIA));
        Assert.assertEquals("7676", new DFPaisTransformer().write(DFPais.SUICA));
        Assert.assertEquals("7706", new DFPaisTransformer().write(DFPais.SURINAME));
        Assert.assertEquals("7722", new DFPaisTransformer().write(DFPais.TADJIQUISTAO_REPUBLICA_DO));
        Assert.assertEquals("7765", new DFPaisTransformer().write(DFPais.TAILANDIA));
        Assert.assertEquals("7803", new DFPaisTransformer().write(DFPais.TANZANIA_REP_UNIDA_DA));
        Assert.assertEquals("7811", new DFPaisTransformer().write(DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS));
        Assert.assertEquals("7820", new DFPaisTransformer().write(DFPais.TERRITORIO_BRIT_OC_INDICO));
        Assert.assertEquals("7838", new DFPaisTransformer().write(DFPais.DJIBUTI));
        Assert.assertEquals("7889", new DFPaisTransformer().write(DFPais.CHADE));
        Assert.assertEquals("7919", new DFPaisTransformer().write(DFPais.TCHECA_REPUBLICA));
        Assert.assertEquals("7951", new DFPaisTransformer().write(DFPais.TIMOR_LESTE));
        Assert.assertEquals("8001", new DFPaisTransformer().write(DFPais.TOGO));
        Assert.assertEquals("8052", new DFPaisTransformer().write(DFPais.TOQUELAU_ILHAS));
        Assert.assertEquals("8109", new DFPaisTransformer().write(DFPais.TONGA));
        Assert.assertEquals("8150", new DFPaisTransformer().write(DFPais.TRINIDAD_E_TOBAGO));
        Assert.assertEquals("8206", new DFPaisTransformer().write(DFPais.TUNISIA));
        Assert.assertEquals("8230", new DFPaisTransformer().write(DFPais.TURCAS_E_CAICOS_ILHAS));
        Assert.assertEquals("8249", new DFPaisTransformer().write(DFPais.TURCOMENISTAO_REPUBLICA_DO));
        Assert.assertEquals("8273", new DFPaisTransformer().write(DFPais.TURQUIA));
        }

        @Test
	public void deveTestarEscrita13() throws Exception {
        Assert.assertEquals("8281", new DFPaisTransformer().write(DFPais.TUVALU));
        Assert.assertEquals("8311", new DFPaisTransformer().write(DFPais.UCRANIA));
        Assert.assertEquals("8338", new DFPaisTransformer().write(DFPais.UGANDA));
        Assert.assertEquals("8451", new DFPaisTransformer().write(DFPais.URUGUAI));
        Assert.assertEquals("8478", new DFPaisTransformer().write(DFPais.UZBEQUISTAO_REPUBLICA_DO));
        Assert.assertEquals("8486", new DFPaisTransformer().write(DFPais.VATICANO_EST_DA_CIDADE_DO));
        Assert.assertEquals("8508", new DFPaisTransformer().write(DFPais.VENEZUELA));
        Assert.assertEquals("8583", new DFPaisTransformer().write(DFPais.VIETNA));
        Assert.assertEquals("8630", new DFPaisTransformer().write(DFPais.VIRGENS_ILHAS_BRITANICAS));
        Assert.assertEquals("8664", new DFPaisTransformer().write(DFPais.VIRGENS_ILHAS_E_U_A));
        Assert.assertEquals("8702", new DFPaisTransformer().write(DFPais.FIJI));
        Assert.assertEquals("8753", new DFPaisTransformer().write(DFPais.WALLIS_E_FUTUNA_ILHAS));
        Assert.assertEquals("8737", new DFPaisTransformer().write(DFPais.WAKE_ILHA));
        Assert.assertEquals("8885", new DFPaisTransformer().write(DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO));
        Assert.assertEquals("8907", new DFPaisTransformer().write(DFPais.ZAMBIA));
        }

}
