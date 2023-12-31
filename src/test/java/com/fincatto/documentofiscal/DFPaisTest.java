package com.fincatto.documentofiscal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Eldevan Nery Junior on 07/05/18.
 * Define os Testes para a classe com.fincatto.documentofiscal.DFPais.java
 *
 */
public class DFPaisTest {

    @Test
    public void deveRepresentarOCodigoCorretamente1() {
        Assert.assertEquals("AFEGANISTAO", DFPais.AFEGANISTAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(132), DFPais.AFEGANISTAO.getCodigo());
        Assert.assertEquals("ALAND, ILHAS", DFPais.ALAND_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(153), DFPais.ALAND_ILHAS.getCodigo());
        Assert.assertEquals("ALBANIA, REPUBLICA  DA", DFPais.ALBANIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(175), DFPais.ALBANIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("ALEMANHA", DFPais.ALEMANHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(230), DFPais.ALEMANHA.getCodigo());
        Assert.assertEquals("BURKINA FASO", DFPais.BURKINA_FASO.getDescricao());
        Assert.assertEquals(Integer.valueOf(310), DFPais.BURKINA_FASO.getCodigo());
        Assert.assertEquals("ANDORRA", DFPais.ANDORRA.getDescricao());
        Assert.assertEquals(Integer.valueOf(370), DFPais.ANDORRA.getCodigo());
        Assert.assertEquals("ANGOLA", DFPais.ANGOLA.getDescricao());
        Assert.assertEquals(Integer.valueOf(400), DFPais.ANGOLA.getCodigo());
        Assert.assertEquals("ANGUILLA", DFPais.ANGUILLA.getDescricao());
        Assert.assertEquals(Integer.valueOf(418), DFPais.ANGUILLA.getCodigo());
        Assert.assertEquals("ANTARTICA", DFPais.ANTARTICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(420), DFPais.ANTARTICA.getCodigo());
        Assert.assertEquals("ANTIGUA E BARBUDA", DFPais.ANTIGUA_E_BARBUDA.getDescricao());
        Assert.assertEquals(Integer.valueOf(434), DFPais.ANTIGUA_E_BARBUDA.getCodigo());
        Assert.assertEquals("ANTILHAS HOLANDESAS", DFPais.ANTILHAS_HOLANDESAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(477), DFPais.ANTILHAS_HOLANDESAS.getCodigo());
        Assert.assertEquals("ARABIA SAUDITA", DFPais.ARABIA_SAUDITA.getDescricao());
        Assert.assertEquals(Integer.valueOf(531), DFPais.ARABIA_SAUDITA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente2() {
        Assert.assertEquals("ARGELIA", DFPais.ARGELIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(590), DFPais.ARGELIA.getCodigo());
        Assert.assertEquals("ARGENTINA", DFPais.ARGENTINA.getDescricao());
        Assert.assertEquals(Integer.valueOf(639), DFPais.ARGENTINA.getCodigo());
        Assert.assertEquals("ARMENIA, REPUBLICA DA", DFPais.ARMENIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(647), DFPais.ARMENIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("ARUBA", DFPais.ARUBA.getDescricao());
        Assert.assertEquals(Integer.valueOf(655), DFPais.ARUBA.getCodigo());
        Assert.assertEquals("AUSTRALIA", DFPais.AUSTRALIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(698), DFPais.AUSTRALIA.getCodigo());
        Assert.assertEquals("AUSTRIA", DFPais.AUSTRIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(728), DFPais.AUSTRIA.getCodigo());
        Assert.assertEquals("AZERBAIJAO, REPUBLICA DO", DFPais.AZERBAIJAO_REPUBLICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(736), DFPais.AZERBAIJAO_REPUBLICA_DO.getCodigo());
        Assert.assertEquals("BAHAMAS, ILHAS", DFPais.BAHAMAS_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(779), DFPais.BAHAMAS_ILHAS.getCodigo());
        Assert.assertEquals("BAHREIN, ILHAS", DFPais.BAHREIN_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(809), DFPais.BAHREIN_ILHAS.getCodigo());
        Assert.assertEquals("BANGLADESH", DFPais.BANGLADESH.getDescricao());
        Assert.assertEquals(Integer.valueOf(817), DFPais.BANGLADESH.getCodigo());
        Assert.assertEquals("BARBADOS", DFPais.BARBADOS.getDescricao());
        Assert.assertEquals(Integer.valueOf(833), DFPais.BARBADOS.getCodigo());
        Assert.assertEquals("BELARUS, REPUBLICA DA", DFPais.BELARUS_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(850), DFPais.BELARUS_REPUBLICA_DA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente3() {
        Assert.assertEquals("BELGICA", DFPais.BELGICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(876), DFPais.BELGICA.getCodigo());
        Assert.assertEquals("BELIZE", DFPais.BELIZE.getDescricao());
        Assert.assertEquals(Integer.valueOf(884), DFPais.BELIZE.getCodigo());
        Assert.assertEquals("BERMUDAS", DFPais.BERMUDAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(906), DFPais.BERMUDAS.getCodigo());
        Assert.assertEquals("MIANMAR (BIRMANIA)", DFPais.MIANMAR_BIRMANIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(930), DFPais.MIANMAR_BIRMANIA.getCodigo());
        Assert.assertEquals("BOLIVIA, ESTADO PLURINACIONAL DA", DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(973), DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA.getCodigo());
        Assert.assertEquals("BOSNIA-HERZEGOVINA (REPUBLICA DA)", DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(981), DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("BONAIRE", DFPais.BONAIRE.getDescricao());
        Assert.assertEquals(Integer.valueOf(990), DFPais.BONAIRE.getCodigo());
        Assert.assertEquals("BOTSUANA", DFPais.BOTSUANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1015), DFPais.BOTSUANA.getCodigo());
        Assert.assertEquals("BOUVET, ILHA", DFPais.BOUVET_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1023), DFPais.BOUVET_ILHA.getCodigo());
        Assert.assertEquals("BRASIL", DFPais.BRASIL.getDescricao());
        Assert.assertEquals(Integer.valueOf(1058), DFPais.BRASIL.getCodigo());
        Assert.assertEquals("BRUNEI", DFPais.BRUNEI.getDescricao());
        Assert.assertEquals(Integer.valueOf(1082), DFPais.BRUNEI.getCodigo());
        Assert.assertEquals("BULGARIA, REPUBLICA DA", DFPais.BULGARIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1112), DFPais.BULGARIA_REPUBLICA_DA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente4() {
        Assert.assertEquals("BURUNDI", DFPais.BURUNDI.getDescricao());
        Assert.assertEquals(Integer.valueOf(1155), DFPais.BURUNDI.getCodigo());
        Assert.assertEquals("BUTAO", DFPais.BUTAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(1198), DFPais.BUTAO.getCodigo());
        Assert.assertEquals("CABO VERDE, REPUBLICA DE", DFPais.CABO_VERDE_REPUBLICA_DE.getDescricao());
        Assert.assertEquals(Integer.valueOf(1279), DFPais.CABO_VERDE_REPUBLICA_DE.getCodigo());
        Assert.assertEquals("CAYMAN, ILHAS", DFPais.CAYMAN_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(1376), DFPais.CAYMAN_ILHAS.getCodigo());
        Assert.assertEquals("CAMBOJA", DFPais.CAMBOJA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1414), DFPais.CAMBOJA.getCodigo());
        Assert.assertEquals("CAMAROES", DFPais.CAMAROES.getDescricao());
        Assert.assertEquals(Integer.valueOf(1457), DFPais.CAMAROES.getCodigo());
        Assert.assertEquals("CANADA", DFPais.CANADA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1490), DFPais.CANADA.getCodigo());
        Assert.assertEquals("CAZAQUISTAO, REPUBLICA DO", DFPais.CAZAQUISTAO_REPUBLICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(1538), DFPais.CAZAQUISTAO_REPUBLICA_DO.getCodigo());
        Assert.assertEquals("CATAR", DFPais.CATAR.getDescricao());
        Assert.assertEquals(Integer.valueOf(1546), DFPais.CATAR.getCodigo());
        Assert.assertEquals("CHILE", DFPais.CHILE.getDescricao());
        Assert.assertEquals(Integer.valueOf(1589), DFPais.CHILE.getCodigo());
        Assert.assertEquals("CHINA, REPUBLICA POPULAR", DFPais.CHINA_REPUBLICA_POPULAR.getDescricao());
        Assert.assertEquals(Integer.valueOf(1600), DFPais.CHINA_REPUBLICA_POPULAR.getCodigo());
        Assert.assertEquals("FORMOSA (TAIWAN)", DFPais.FORMOSA_TAIWAN.getDescricao());
        Assert.assertEquals(Integer.valueOf(1619), DFPais.FORMOSA_TAIWAN.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente5() {
        Assert.assertEquals("CHIPRE", DFPais.CHIPRE.getDescricao());
        Assert.assertEquals(Integer.valueOf(1635), DFPais.CHIPRE.getCodigo());
        Assert.assertEquals("COCOS(KEELING),ILHAS", DFPais.COCOS_KEELING_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(1651), DFPais.COCOS_KEELING_ILHAS.getCodigo());
        Assert.assertEquals("COLOMBIA", DFPais.COLOMBIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1694), DFPais.COLOMBIA.getCodigo());
        Assert.assertEquals("COMORES, ILHAS", DFPais.COMORES_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(1732), DFPais.COMORES_ILHAS.getCodigo());
        Assert.assertEquals("CONGO", DFPais.CONGO.getDescricao());
        Assert.assertEquals(Integer.valueOf(1775), DFPais.CONGO.getCodigo());
        Assert.assertEquals("COOK, ILHAS", DFPais.COOK_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(1830), DFPais.COOK_ILHAS.getCodigo());
        Assert.assertEquals("COREIA (DO NORTE), REP.POP.DEMOCRATICA", DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1872), DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA.getCodigo());
        Assert.assertEquals("COREIA (DO SUL), REPUBLICA DA", DFPais.COREIA_DO_SUL_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1902), DFPais.COREIA_DO_SUL_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("COSTA DO MARFIM", DFPais.COSTA_DO_MARFIM.getDescricao());
        Assert.assertEquals(Integer.valueOf(1937), DFPais.COSTA_DO_MARFIM.getCodigo());
        Assert.assertEquals("CROACIA (REPUBLICA DA)", DFPais.CROACIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1953), DFPais.CROACIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("COSTA RICA", DFPais.COSTA_RICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1961), DFPais.COSTA_RICA.getCodigo());
        Assert.assertEquals("KUWAIT", DFPais.KUWAIT.getDescricao());
        Assert.assertEquals(Integer.valueOf(1988), DFPais.KUWAIT.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente6() {
        Assert.assertEquals("CUBA", DFPais.CUBA.getDescricao());
        Assert.assertEquals(Integer.valueOf(1996), DFPais.CUBA.getCodigo());
        Assert.assertEquals("CURACAO", DFPais.CURACAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(2003), DFPais.CURACAO.getCodigo());
        Assert.assertEquals("BENIN", DFPais.BENIN.getDescricao());
        Assert.assertEquals(Integer.valueOf(2291), DFPais.BENIN.getCodigo());
        Assert.assertEquals("DINAMARCA", DFPais.DINAMARCA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2321), DFPais.DINAMARCA.getCodigo());
        Assert.assertEquals("DOMINICA,ILHA", DFPais.DOMINICA_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2356), DFPais.DOMINICA_ILHA.getCodigo());
        Assert.assertEquals("EQUADOR", DFPais.EQUADOR.getDescricao());
        Assert.assertEquals(Integer.valueOf(2399), DFPais.EQUADOR.getCodigo());
        Assert.assertEquals("EGITO", DFPais.EGITO.getDescricao());
        Assert.assertEquals(Integer.valueOf(2402), DFPais.EGITO.getCodigo());
        Assert.assertEquals("ERITREIA", DFPais.ERITREIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2437), DFPais.ERITREIA.getCodigo());
        Assert.assertEquals("EMIRADOS ARABES UNIDOS", DFPais.EMIRADOS_ARABES_UNIDOS.getDescricao());
        Assert.assertEquals(Integer.valueOf(2445), DFPais.EMIRADOS_ARABES_UNIDOS.getCodigo());
        Assert.assertEquals("ESPANHA", DFPais.ESPANHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2453), DFPais.ESPANHA.getCodigo());
        Assert.assertEquals("ESLOVENIA, REPUBLICA DA", DFPais.ESLOVENIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2461), DFPais.ESLOVENIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("ESLOVACA, REPUBLICA", DFPais.ESLOVACA_REPUBLICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2470), DFPais.ESLOVACA_REPUBLICA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente7() {
        Assert.assertEquals("ESTADOS UNIDOS", DFPais.ESTADOS_UNIDOS.getDescricao());
        Assert.assertEquals(Integer.valueOf(2496), DFPais.ESTADOS_UNIDOS.getCodigo());
        Assert.assertEquals("ESTONIA, REPUBLICA DA", DFPais.ESTONIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2518), DFPais.ESTONIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("ETIOPIA", DFPais.ETIOPIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2534), DFPais.ETIOPIA.getCodigo());
        Assert.assertEquals("FALKLAND (ILHAS MALVINAS)", DFPais.FALKLAND_ILHAS_MALVINAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(2550), DFPais.FALKLAND_ILHAS_MALVINAS.getCodigo());
        Assert.assertEquals("FEROE, ILHAS", DFPais.FEROE_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(2593), DFPais.FEROE_ILHAS.getCodigo());
        Assert.assertEquals("FILIPINAS", DFPais.FILIPINAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(2674), DFPais.FILIPINAS.getCodigo());
        Assert.assertEquals("FINLANDIA", DFPais.FINLANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2712), DFPais.FINLANDIA.getCodigo());
        Assert.assertEquals("FRANCA", DFPais.FRANCA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2755), DFPais.FRANCA.getCodigo());
        Assert.assertEquals("GABAO", DFPais.GABAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(2810), DFPais.GABAO.getCodigo());
        Assert.assertEquals("GAMBIA", DFPais.GAMBIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2852), DFPais.GAMBIA.getCodigo());
        Assert.assertEquals("GANA", DFPais.GANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2895), DFPais.GANA.getCodigo());
        Assert.assertEquals("GEORGIA, REPUBLICA DA", DFPais.GEORGIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2917), DFPais.GEORGIA_REPUBLICA_DA.getCodigo());
    }
    
    @Test
    public void deveRepresentarOCodigoCorretamente8() {
        Assert.assertEquals("ILHAS GEORGIA DO SUL E SANDWICH DO SUL", DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL.getDescricao());
        Assert.assertEquals(Integer.valueOf(2925), DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL.getCodigo());
        Assert.assertEquals("GIBRALTAR", DFPais.GIBRALTAR.getDescricao());
        Assert.assertEquals(Integer.valueOf(2933), DFPais.GIBRALTAR.getCodigo());
        Assert.assertEquals("GRANADA", DFPais.GRANADA.getDescricao());
        Assert.assertEquals(Integer.valueOf(2976), DFPais.GRANADA.getCodigo());
        Assert.assertEquals("GRECIA", DFPais.GRECIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3018), DFPais.GRECIA.getCodigo());
        Assert.assertEquals("GROENLANDIA", DFPais.GROENLANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3050), DFPais.GROENLANDIA.getCodigo());
        Assert.assertEquals("GUADALUPE", DFPais.GUADALUPE.getDescricao());
        Assert.assertEquals(Integer.valueOf(3093), DFPais.GUADALUPE.getCodigo());
        Assert.assertEquals("GUAM", DFPais.GUAM.getDescricao());
        Assert.assertEquals(Integer.valueOf(3131), DFPais.GUAM.getCodigo());
        Assert.assertEquals("GUATEMALA", DFPais.GUATEMALA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3174), DFPais.GUATEMALA.getCodigo());
        Assert.assertEquals("GUERNSEY, ILHA DO CANAL (INCLUI ALDERNEY E SARK)", DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK.getDescricao());
        Assert.assertEquals(Integer.valueOf(3212), DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK.getCodigo());
        Assert.assertEquals("GUIANA FRANCESA", DFPais.GUIANA_FRANCESA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3255), DFPais.GUIANA_FRANCESA.getCodigo());
        Assert.assertEquals("GUINE", DFPais.GUINE.getDescricao());
        Assert.assertEquals(Integer.valueOf(3298), DFPais.GUINE.getCodigo());
        Assert.assertEquals("GUINE-EQUATORIAL", DFPais.GUINE_EQUATORIAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(3310), DFPais.GUINE_EQUATORIAL.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente9() {
        Assert.assertEquals("GUINE-BISSAU", DFPais.GUINE_BISSAU.getDescricao());
        Assert.assertEquals(Integer.valueOf(3344), DFPais.GUINE_BISSAU.getCodigo());
        Assert.assertEquals("GUIANA", DFPais.GUIANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3379), DFPais.GUIANA.getCodigo());
        Assert.assertEquals("HAITI", DFPais.HAITI.getDescricao());
        Assert.assertEquals(Integer.valueOf(3417), DFPais.HAITI.getCodigo());
        Assert.assertEquals("ILHA HEARD E ILHAS MCDONALD", DFPais.ILHA_HEARD_E_ILHAS_MCDONALD.getDescricao());
        Assert.assertEquals(Integer.valueOf(3433), DFPais.ILHA_HEARD_E_ILHAS_MCDONALD.getCodigo());
        Assert.assertEquals("HONDURAS", DFPais.HONDURAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(3450), DFPais.HONDURAS.getCodigo());
        Assert.assertEquals("HONG KONG", DFPais.HONG_KONG.getDescricao());
        Assert.assertEquals(Integer.valueOf(3514), DFPais.HONG_KONG.getCodigo());
        Assert.assertEquals("HUNGRIA, REPUBLICA DA", DFPais.HUNGRIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3557), DFPais.HUNGRIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("IEMEN", DFPais.IEMEN.getDescricao());
        Assert.assertEquals(Integer.valueOf(3573), DFPais.IEMEN.getCodigo());
        Assert.assertEquals("MAN, ILHA DE", DFPais.MAN_ILHA_DE.getDescricao());
        Assert.assertEquals(Integer.valueOf(3595), DFPais.MAN_ILHA_DE.getCodigo());
        Assert.assertEquals("INDIA", DFPais.INDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3611), DFPais.INDIA.getCodigo());
        Assert.assertEquals("INDONESIA", DFPais.INDONESIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3654), DFPais.INDONESIA.getCodigo());
        Assert.assertEquals("IRAQUE", DFPais.IRAQUE.getDescricao());
        Assert.assertEquals(Integer.valueOf(3697), DFPais.IRAQUE.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente10() {
        Assert.assertEquals("IRA, REPUBLICA ISLAMICA DO", DFPais.IRA_REPUBLICA_ISLAMICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(3727), DFPais.IRA_REPUBLICA_ISLAMICA_DO.getCodigo());
        Assert.assertEquals("IRLANDA", DFPais.IRLANDA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3751), DFPais.IRLANDA.getCodigo());
        Assert.assertEquals("ISLANDIA", DFPais.ISLANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3794), DFPais.ISLANDIA.getCodigo());
        Assert.assertEquals("ISRAEL", DFPais.ISRAEL.getDescricao());
        Assert.assertEquals(Integer.valueOf(3832), DFPais.ISRAEL.getCodigo());
        Assert.assertEquals("ITALIA", DFPais.ITALIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3867), DFPais.ITALIA.getCodigo());
        Assert.assertEquals("JAMAICA", DFPais.JAMAICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(3913), DFPais.JAMAICA.getCodigo());
        Assert.assertEquals("JERSEY, ILHA DO CANAL", DFPais.JERSEY_ILHA_DO_CANAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(3930), DFPais.JERSEY_ILHA_DO_CANAL.getCodigo());
        Assert.assertEquals("JOHNSTON, ILHAS", DFPais.JOHNSTON_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(3964), DFPais.JOHNSTON_ILHAS.getCodigo());
        Assert.assertEquals("JAPAO", DFPais.JAPAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(3999), DFPais.JAPAO.getCodigo());
        Assert.assertEquals("JORDANIA", DFPais.JORDANIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4030), DFPais.JORDANIA.getCodigo());
        Assert.assertEquals("KIRIBATI", DFPais.KIRIBATI.getDescricao());
        Assert.assertEquals(Integer.valueOf(4111), DFPais.KIRIBATI.getCodigo());
        Assert.assertEquals("LAOS, REP.POP.DEMOCR.DO", DFPais.LAOS_REP_POP_DEMOCR_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4200), DFPais.LAOS_REP_POP_DEMOCR_DO.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente11() {
        Assert.assertEquals("LEBUAN,ILHAS", DFPais.LEBUAN_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4235), DFPais.LEBUAN_ILHAS.getCodigo());
        Assert.assertEquals("LESOTO", DFPais.LESOTO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4260), DFPais.LESOTO.getCodigo());
        Assert.assertEquals("LETONIA, REPUBLICA DA", DFPais.LETONIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4278), DFPais.LETONIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("LIBANO", DFPais.LIBANO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4316), DFPais.LIBANO.getCodigo());
        Assert.assertEquals("LIBERIA", DFPais.LIBERIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4340), DFPais.LIBERIA.getCodigo());
        Assert.assertEquals("LIBIA", DFPais.LIBIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4383), DFPais.LIBIA.getCodigo());
        Assert.assertEquals("LIECHTENSTEIN", DFPais.LIECHTENSTEIN.getDescricao());
        Assert.assertEquals(Integer.valueOf(4405), DFPais.LIECHTENSTEIN.getCodigo());
        Assert.assertEquals("LITUANIA, REPUBLICA DA", DFPais.LITUANIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4421), DFPais.LITUANIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("LUXEMBURGO", DFPais.LUXEMBURGO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4456), DFPais.LUXEMBURGO.getCodigo());
        Assert.assertEquals("MACAU", DFPais.MACAU.getDescricao());
        Assert.assertEquals(Integer.valueOf(4472), DFPais.MACAU.getCodigo());
        Assert.assertEquals("MACEDONIA, ANT.REP.IUGOSLAVA", DFPais.MACEDONIA_ANT_REP_IUGOSLAVA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4499), DFPais.MACEDONIA_ANT_REP_IUGOSLAVA.getCodigo());
        Assert.assertEquals("MADAGASCAR", DFPais.MADAGASCAR.getDescricao());
        Assert.assertEquals(Integer.valueOf(4502), DFPais.MADAGASCAR.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente12() {
        Assert.assertEquals("MADEIRA, ILHA DA", DFPais.MADEIRA_ILHA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4525), DFPais.MADEIRA_ILHA_DA.getCodigo());
        Assert.assertEquals("MALASIA", DFPais.MALASIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4553), DFPais.MALASIA.getCodigo());
        Assert.assertEquals("MALAVI", DFPais.MALAVI.getDescricao());
        Assert.assertEquals(Integer.valueOf(4588), DFPais.MALAVI.getCodigo());
        Assert.assertEquals("MALDIVAS", DFPais.MALDIVAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4618), DFPais.MALDIVAS.getCodigo());
        Assert.assertEquals("MALI", DFPais.MALI.getDescricao());
        Assert.assertEquals(Integer.valueOf(4642), DFPais.MALI.getCodigo());
        Assert.assertEquals("MALTA", DFPais.MALTA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4677), DFPais.MALTA.getCodigo());
        Assert.assertEquals("MARIANAS DO NORTE", DFPais.MARIANAS_DO_NORTE.getDescricao());
        Assert.assertEquals(Integer.valueOf(4723), DFPais.MARIANAS_DO_NORTE.getCodigo());
        Assert.assertEquals("MARROCOS", DFPais.MARROCOS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4740), DFPais.MARROCOS.getCodigo());
        Assert.assertEquals("MARSHALL,ILHAS", DFPais.MARSHALL_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4766), DFPais.MARSHALL_ILHAS.getCodigo());
        Assert.assertEquals("MARTINICA", DFPais.MARTINICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4774), DFPais.MARTINICA.getCodigo());
        Assert.assertEquals("MAURICIO", DFPais.MAURICIO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4855), DFPais.MAURICIO.getCodigo());
        Assert.assertEquals("MAURITANIA", DFPais.MAURITANIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4880), DFPais.MAURITANIA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente13() {
        Assert.assertEquals("MAYOTTE (ILHAS FRANCESAS)", DFPais.MAYOTTE_ILHAS_FRANCESAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4898), DFPais.MAYOTTE_ILHAS_FRANCESAS.getCodigo());
        Assert.assertEquals("MIDWAY, ILHAS", DFPais.MIDWAY_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(4901), DFPais.MIDWAY_ILHAS.getCodigo());
        Assert.assertEquals("MEXICO", DFPais.MEXICO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4936), DFPais.MEXICO.getCodigo());
        Assert.assertEquals("MOLDAVIA, REPUBLICA DA", DFPais.MOLDAVIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4944), DFPais.MOLDAVIA_REPUBLICA_DA.getCodigo());
        Assert.assertEquals("MONACO", DFPais.MONACO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4952), DFPais.MONACO.getCodigo());
        Assert.assertEquals("MONGOLIA", DFPais.MONGOLIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4979), DFPais.MONGOLIA.getCodigo());
        Assert.assertEquals("MONTENEGRO", DFPais.MONTENEGRO.getDescricao());
        Assert.assertEquals(Integer.valueOf(4985), DFPais.MONTENEGRO.getCodigo());
        Assert.assertEquals("MICRONESIA", DFPais.MICRONESIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(4995), DFPais.MICRONESIA.getCodigo());
        Assert.assertEquals("MONTSERRAT,ILHAS", DFPais.MONTSERRAT_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(5010), DFPais.MONTSERRAT_ILHAS.getCodigo());
        Assert.assertEquals("MOCAMBIQUE", DFPais.MOCAMBIQUE.getDescricao());
        Assert.assertEquals(Integer.valueOf(5053), DFPais.MOCAMBIQUE.getCodigo());
        Assert.assertEquals("NAMIBIA", DFPais.NAMIBIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5070), DFPais.NAMIBIA.getCodigo());
        Assert.assertEquals("NAURU", DFPais.NAURU.getDescricao());
        Assert.assertEquals(Integer.valueOf(5088), DFPais.NAURU.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente14() {
        Assert.assertEquals("CHRISTMAS,ILHA (NAVIDAD)", DFPais.CHRISTMAS_ILHA_NAVIDAD.getDescricao());
        Assert.assertEquals(Integer.valueOf(5118), DFPais.CHRISTMAS_ILHA_NAVIDAD.getCodigo());
        Assert.assertEquals("NEPAL", DFPais.NEPAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(5177), DFPais.NEPAL.getCodigo());
        Assert.assertEquals("NICARAGUA", DFPais.NICARAGUA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5215), DFPais.NICARAGUA.getCodigo());
        Assert.assertEquals("NIGER", DFPais.NIGER.getDescricao());
        Assert.assertEquals(Integer.valueOf(5258), DFPais.NIGER.getCodigo());
        Assert.assertEquals("NIGERIA", DFPais.NIGERIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5282), DFPais.NIGERIA.getCodigo());
        Assert.assertEquals("NIUE,ILHA", DFPais.NIUE_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5312), DFPais.NIUE_ILHA.getCodigo());
        Assert.assertEquals("NORFOLK,ILHA", DFPais.NORFOLK_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5355), DFPais.NORFOLK_ILHA.getCodigo());
        Assert.assertEquals("NORUEGA", DFPais.NORUEGA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5380), DFPais.NORUEGA.getCodigo());
        Assert.assertEquals("NOVA CALEDONIA", DFPais.NOVA_CALEDONIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5428), DFPais.NOVA_CALEDONIA.getCodigo());
        Assert.assertEquals("PAPUA NOVA GUINE", DFPais.PAPUA_NOVA_GUINE.getDescricao());
        Assert.assertEquals(Integer.valueOf(5452), DFPais.PAPUA_NOVA_GUINE.getCodigo());
        Assert.assertEquals("NOVA ZELANDIA", DFPais.NOVA_ZELANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5487), DFPais.NOVA_ZELANDIA.getCodigo());
        Assert.assertEquals("VANUATU", DFPais.VANUATU.getDescricao());
        Assert.assertEquals(Integer.valueOf(5517), DFPais.VANUATU.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente15() {
        Assert.assertEquals("OMA", DFPais.OMA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5568), DFPais.OMA.getCodigo());
        Assert.assertEquals("PACIFICO,ILHAS DO (POSSESSAO DOS EUA)", DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5665), DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA.getCodigo());
        Assert.assertEquals("PAISES BAIXOS (HOLANDA)", DFPais.PAISES_BAIXOS_HOLANDA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5738), DFPais.PAISES_BAIXOS_HOLANDA.getCodigo());
        Assert.assertEquals("PALAU", DFPais.PALAU.getDescricao());
        Assert.assertEquals(Integer.valueOf(5754), DFPais.PALAU.getCodigo());
        Assert.assertEquals("PAQUISTAO", DFPais.PAQUISTAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(5762), DFPais.PAQUISTAO.getCodigo());
        Assert.assertEquals("PALESTINA", DFPais.PALESTINA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5780), DFPais.PALESTINA.getCodigo());
        Assert.assertEquals("PANAMA", DFPais.PANAMA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5800), DFPais.PANAMA.getCodigo());
        Assert.assertEquals("PARAGUAI", DFPais.PARAGUAI.getDescricao());
        Assert.assertEquals(Integer.valueOf(5860), DFPais.PARAGUAI.getCodigo());
        Assert.assertEquals("PERU", DFPais.PERU.getDescricao());
        Assert.assertEquals(Integer.valueOf(5894), DFPais.PERU.getCodigo());
        Assert.assertEquals("PITCAIRN,ILHA", DFPais.PITCAIRN_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5932), DFPais.PITCAIRN_ILHA.getCodigo());
        Assert.assertEquals("POLINESIA FRANCESA", DFPais.POLINESIA_FRANCESA.getDescricao());
        Assert.assertEquals(Integer.valueOf(5991), DFPais.POLINESIA_FRANCESA.getCodigo());
        Assert.assertEquals("POLONIA, REPUBLICA DA", DFPais.POLONIA_REPUBLICA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6033), DFPais.POLONIA_REPUBLICA_DA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente16() {
        Assert.assertEquals("PORTUGAL", DFPais.PORTUGAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(6076), DFPais.PORTUGAL.getCodigo());
        Assert.assertEquals("PORTO RICO", DFPais.PORTO_RICO.getDescricao());
        Assert.assertEquals(Integer.valueOf(6114), DFPais.PORTO_RICO.getCodigo());
        Assert.assertEquals("QUENIA", DFPais.QUENIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6238), DFPais.QUENIA.getCodigo());
        Assert.assertEquals("QUIRGUIZ, REPUBLICA", DFPais.QUIRGUIZ_REPUBLICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6254), DFPais.QUIRGUIZ_REPUBLICA.getCodigo());
        Assert.assertEquals("REINO UNIDO", DFPais.REINO_UNIDO.getDescricao());
        Assert.assertEquals(Integer.valueOf(6289), DFPais.REINO_UNIDO.getCodigo());
        Assert.assertEquals("REPUBLICA CENTRO-AFRICANA", DFPais.REPUBLICA_CENTRO_AFRICANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6408), DFPais.REPUBLICA_CENTRO_AFRICANA.getCodigo());
        Assert.assertEquals("REPUBLICA DOMINICANA", DFPais.REPUBLICA_DOMINICANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6475), DFPais.REPUBLICA_DOMINICANA.getCodigo());
        Assert.assertEquals("REUNIAO, ILHA", DFPais.REUNIAO_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6602), DFPais.REUNIAO_ILHA.getCodigo());
        Assert.assertEquals("ZIMBABUE", DFPais.ZIMBABUE.getDescricao());
        Assert.assertEquals(Integer.valueOf(6653), DFPais.ZIMBABUE.getCodigo());
        Assert.assertEquals("ROMENIA", DFPais.ROMENIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6700), DFPais.ROMENIA.getCodigo());
        Assert.assertEquals("RUANDA", DFPais.RUANDA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6750), DFPais.RUANDA.getCodigo());
        Assert.assertEquals("RUSSIA, FEDERACAO DA", DFPais.RUSSIA_FEDERACAO_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6769), DFPais.RUSSIA_FEDERACAO_DA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente17() {
        Assert.assertEquals("SALOMAO, ILHAS", DFPais.SALOMAO_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(6777), DFPais.SALOMAO_ILHAS.getCodigo());
        Assert.assertEquals("SAARA OCIDENTAL", DFPais.SAARA_OCIDENTAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(6858), DFPais.SAARA_OCIDENTAL.getCodigo());
        Assert.assertEquals("EL SALVADOR", DFPais.EL_SALVADOR.getDescricao());
        Assert.assertEquals(Integer.valueOf(6874), DFPais.EL_SALVADOR.getCodigo());
        Assert.assertEquals("SAMOA", DFPais.SAMOA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6904), DFPais.SAMOA.getCodigo());
        Assert.assertEquals("SAMOA AMERICANA", DFPais.SAMOA_AMERICANA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6912), DFPais.SAMOA_AMERICANA.getCodigo());
        Assert.assertEquals("SAO CRISTOVAO E NEVES,ILHAS", DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(6955), DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS.getCodigo());
        Assert.assertEquals("SAO BARTOLOMEU", DFPais.SAO_BARTOLOMEU.getDescricao());
        Assert.assertEquals(Integer.valueOf(6939), DFPais.SAO_BARTOLOMEU.getCodigo());
        Assert.assertEquals("SAN MARINO", DFPais.SAN_MARINO.getDescricao());
        Assert.assertEquals(Integer.valueOf(6971), DFPais.SAN_MARINO.getCodigo());
        Assert.assertEquals("ILHAS DE SAO MARTINHO (PARTE FRANCESA)", DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6980), DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA.getCodigo());
        Assert.assertEquals("SAO MARTINHO, ILHA DE (PARTE FRANCESA)", DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA.getDescricao());
        Assert.assertEquals(Integer.valueOf(6998), DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA.getCodigo());
        Assert.assertEquals("SAO PEDRO E MIQUELON", DFPais.SAO_PEDRO_E_MIQUELON.getDescricao());
        Assert.assertEquals(Integer.valueOf(7005), DFPais.SAO_PEDRO_E_MIQUELON.getCodigo());
        Assert.assertEquals("SAO VICENTE E GRANADINAS", DFPais.SAO_VICENTE_E_GRANADINAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(7056), DFPais.SAO_VICENTE_E_GRANADINAS.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente18() {
        Assert.assertEquals("SANTA HELENA", DFPais.SANTA_HELENA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7102), DFPais.SANTA_HELENA.getCodigo());
        Assert.assertEquals("SANTA LUCIA", DFPais.SANTA_LUCIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7153), DFPais.SANTA_LUCIA.getCodigo());
        Assert.assertEquals("SAO TOME E PRINCIPE, ILHAS", DFPais.SAO_TOME_E_PRINCIPE_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(7200), DFPais.SAO_TOME_E_PRINCIPE_ILHAS.getCodigo());
        Assert.assertEquals("SENEGAL", DFPais.SENEGAL.getDescricao());
        Assert.assertEquals(Integer.valueOf(7285), DFPais.SENEGAL.getCodigo());
        Assert.assertEquals("SEYCHELLES", DFPais.SEYCHELLES.getDescricao());
        Assert.assertEquals(Integer.valueOf(7315), DFPais.SEYCHELLES.getCodigo());
        Assert.assertEquals("SERRA LEOA", DFPais.SERRA_LEOA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7358), DFPais.SERRA_LEOA.getCodigo());
        Assert.assertEquals("SERVIA", DFPais.SERVIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7370), DFPais.SERVIA.getCodigo());
        Assert.assertEquals("CINGAPURA", DFPais.CINGAPURA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7412), DFPais.CINGAPURA.getCodigo());
        Assert.assertEquals("SIRIA, REPUBLICA ARABE DA", DFPais.SIRIA_REPUBLICA_ARABE_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7447), DFPais.SIRIA_REPUBLICA_ARABE_DA.getCodigo());
        Assert.assertEquals("SOMALIA", DFPais.SOMALIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7480), DFPais.SOMALIA.getCodigo());
        Assert.assertEquals("SRI LANKA", DFPais.SRI_LANKA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7501), DFPais.SRI_LANKA.getCodigo());
        Assert.assertEquals("SUAZILANDIA", DFPais.SUAZILANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7544), DFPais.SUAZILANDIA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente19() {
        Assert.assertEquals("SVALBARD E JAN MAYERN", DFPais.SVALBARD_E_JAN_MAYERN.getDescricao());
        Assert.assertEquals(Integer.valueOf(7552), DFPais.SVALBARD_E_JAN_MAYERN.getCodigo());
        Assert.assertEquals("AFRICA DO SUL", DFPais.AFRICA_DO_SUL.getDescricao());
        Assert.assertEquals(Integer.valueOf(7560), DFPais.AFRICA_DO_SUL.getCodigo());
        Assert.assertEquals("SUDAO", DFPais.SUDAO.getDescricao());
        Assert.assertEquals(Integer.valueOf(7595), DFPais.SUDAO.getCodigo());
        Assert.assertEquals("SUDÃO DO SUL", DFPais.SUD_O_DO_SUL.getDescricao());
        Assert.assertEquals(Integer.valueOf(7600), DFPais.SUD_O_DO_SUL.getCodigo());
        Assert.assertEquals("SUECIA", DFPais.SUECIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7641), DFPais.SUECIA.getCodigo());
        Assert.assertEquals("SUICA", DFPais.SUICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7676), DFPais.SUICA.getCodigo());
        Assert.assertEquals("SURINAME", DFPais.SURINAME.getDescricao());
        Assert.assertEquals(Integer.valueOf(7706), DFPais.SURINAME.getCodigo());
        Assert.assertEquals("TADJIQUISTAO, REPUBLICA DO", DFPais.TADJIQUISTAO_REPUBLICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(7722), DFPais.TADJIQUISTAO_REPUBLICA_DO.getCodigo());
        Assert.assertEquals("TAILANDIA", DFPais.TAILANDIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7765), DFPais.TAILANDIA.getCodigo());
        Assert.assertEquals("TANZANIA, REP.UNIDA DA", DFPais.TANZANIA_REP_UNIDA_DA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7803), DFPais.TANZANIA_REP_UNIDA_DA.getCodigo());
        Assert.assertEquals("TERRAS AUSTRAIS E ANTARTICAS FRANCESAS", DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(7811), DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS.getCodigo());
        Assert.assertEquals("TERRITORIO BRIT.OC.INDICO", DFPais.TERRITORIO_BRIT_OC_INDICO.getDescricao());
        Assert.assertEquals(Integer.valueOf(7820), DFPais.TERRITORIO_BRIT_OC_INDICO.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente20() {
        Assert.assertEquals("DJIBUTI", DFPais.DJIBUTI.getDescricao());
        Assert.assertEquals(Integer.valueOf(7838), DFPais.DJIBUTI.getCodigo());
        Assert.assertEquals("CHADE", DFPais.CHADE.getDescricao());
        Assert.assertEquals(Integer.valueOf(7889), DFPais.CHADE.getCodigo());
        Assert.assertEquals("TCHECA, REPUBLICA", DFPais.TCHECA_REPUBLICA.getDescricao());
        Assert.assertEquals(Integer.valueOf(7919), DFPais.TCHECA_REPUBLICA.getCodigo());
        Assert.assertEquals("TIMOR LESTE", DFPais.TIMOR_LESTE.getDescricao());
        Assert.assertEquals(Integer.valueOf(7951), DFPais.TIMOR_LESTE.getCodigo());
        Assert.assertEquals("TOGO", DFPais.TOGO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8001), DFPais.TOGO.getCodigo());
        Assert.assertEquals("TOQUELAU,ILHAS", DFPais.TOQUELAU_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(8052), DFPais.TOQUELAU_ILHAS.getCodigo());
        Assert.assertEquals("TONGA", DFPais.TONGA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8109), DFPais.TONGA.getCodigo());
        Assert.assertEquals("TRINIDAD E TOBAGO", DFPais.TRINIDAD_E_TOBAGO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8150), DFPais.TRINIDAD_E_TOBAGO.getCodigo());
        Assert.assertEquals("TUNISIA", DFPais.TUNISIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8206), DFPais.TUNISIA.getCodigo());
        Assert.assertEquals("TURCAS E CAICOS,ILHAS", DFPais.TURCAS_E_CAICOS_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(8230), DFPais.TURCAS_E_CAICOS_ILHAS.getCodigo());
        Assert.assertEquals("TURCOMENISTAO, REPUBLICA DO", DFPais.TURCOMENISTAO_REPUBLICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8249), DFPais.TURCOMENISTAO_REPUBLICA_DO.getCodigo());
        Assert.assertEquals("TURQUIA", DFPais.TURQUIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8273), DFPais.TURQUIA.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente21() {
        Assert.assertEquals("TUVALU", DFPais.TUVALU.getDescricao());
        Assert.assertEquals(Integer.valueOf(8281), DFPais.TUVALU.getCodigo());
        Assert.assertEquals("UCRANIA", DFPais.UCRANIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8311), DFPais.UCRANIA.getCodigo());
        Assert.assertEquals("UGANDA", DFPais.UGANDA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8338), DFPais.UGANDA.getCodigo());
        Assert.assertEquals("URUGUAI", DFPais.URUGUAI.getDescricao());
        Assert.assertEquals(Integer.valueOf(8451), DFPais.URUGUAI.getCodigo());
        Assert.assertEquals("UZBEQUISTAO, REPUBLICA DO", DFPais.UZBEQUISTAO_REPUBLICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8478), DFPais.UZBEQUISTAO_REPUBLICA_DO.getCodigo());
        Assert.assertEquals("VATICANO, EST.DA CIDADE DO", DFPais.VATICANO_EST_DA_CIDADE_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8486), DFPais.VATICANO_EST_DA_CIDADE_DO.getCodigo());
        Assert.assertEquals("VENEZUELA", DFPais.VENEZUELA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8508), DFPais.VENEZUELA.getCodigo());
        Assert.assertEquals("VIETNA", DFPais.VIETNA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8583), DFPais.VIETNA.getCodigo());
        Assert.assertEquals("VIRGENS,ILHAS (BRITANICAS)", DFPais.VIRGENS_ILHAS_BRITANICAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(8630), DFPais.VIRGENS_ILHAS_BRITANICAS.getCodigo());
        Assert.assertEquals("VIRGENS,ILHAS (E.U.A.)", DFPais.VIRGENS_ILHAS_E_U_A.getDescricao());
        Assert.assertEquals(Integer.valueOf(8664), DFPais.VIRGENS_ILHAS_E_U_A.getCodigo());
        Assert.assertEquals("FIJI", DFPais.FIJI.getDescricao());
        Assert.assertEquals(Integer.valueOf(8702), DFPais.FIJI.getCodigo());
        Assert.assertEquals("WALLIS E FUTUNA, ILHAS", DFPais.WALLIS_E_FUTUNA_ILHAS.getDescricao());
        Assert.assertEquals(Integer.valueOf(8753), DFPais.WALLIS_E_FUTUNA_ILHAS.getCodigo());
    }

    @Test
    public void deveRepresentarOCodigoCorretamente22() {
        Assert.assertEquals("WAKE, ILHA", DFPais.WAKE_ILHA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8737), DFPais.WAKE_ILHA.getCodigo());
        Assert.assertEquals("CONGO, REPUBLICA DEMOCRATICA DO", DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO.getDescricao());
        Assert.assertEquals(Integer.valueOf(8885), DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO.getCodigo());
        Assert.assertEquals("ZAMBIA", DFPais.ZAMBIA.getDescricao());
        Assert.assertEquals(Integer.valueOf(8907), DFPais.ZAMBIA.getCodigo());
    }



    @Test
    public void deveRetornarNullCasoTenteBuscarUmCodigoErrado() {
        Assert.assertNull(DFPais.valueOfCodigo("1"));
        Assert.assertNull(DFPais.valueOfCodigo(1));
    }

    @Test
    public void deveSerADescricaoAoInvocarToString() {
        Assert.assertEquals("AFRICA DO SUL", DFPais.AFRICA_DO_SUL.toString());
        Assert.assertEquals("BOSNIA-HERZEGOVINA (REPUBLICA DA)", DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA.toString());
    }

    @Test
    public void deveRetornarListaAoPesquisarPorNome() {
        Assert.assertEquals(Arrays.asList(DFPais.BRASIL, DFPais.GIBRALTAR), DFPais.getListByDesc("BRA"));
        Assert.assertEquals(Arrays.asList(DFPais.BRASIL, DFPais.GIBRALTAR), DFPais.getListByDesc("bra"));
        Assert.assertEquals(Arrays.asList(DFPais.BRASIL, DFPais.GIBRALTAR), DFPais.getListByDesc("Bra"));
        Assert.assertEquals(Arrays.asList( DFPais.BRASIL, DFPais.HONDURAS,
                DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS), DFPais.getListByDesc("RAS"));
    }


    @Test
    public void deveRetornarPorCodigo1() {
         Assert.assertEquals(DFPais.AFEGANISTAO, DFPais.valueOfCodigo("132"));
         Assert.assertEquals(DFPais.AFEGANISTAO, DFPais.valueOfCodigo(132));
         Assert.assertEquals(DFPais.ALAND_ILHAS, DFPais.valueOfCodigo("153"));
         Assert.assertEquals(DFPais.ALAND_ILHAS, DFPais.valueOfCodigo(153));
         Assert.assertEquals(DFPais.ALBANIA_REPUBLICA_DA, DFPais.valueOfCodigo("175"));
         Assert.assertEquals(DFPais.ALBANIA_REPUBLICA_DA, DFPais.valueOfCodigo(175));
         Assert.assertEquals(DFPais.ALEMANHA, DFPais.valueOfCodigo("230"));
         Assert.assertEquals(DFPais.ALEMANHA, DFPais.valueOfCodigo(230));
         Assert.assertEquals(DFPais.BURKINA_FASO, DFPais.valueOfCodigo("310"));
         Assert.assertEquals(DFPais.BURKINA_FASO, DFPais.valueOfCodigo(310));
         Assert.assertEquals(DFPais.ANDORRA, DFPais.valueOfCodigo("370"));
         Assert.assertEquals(DFPais.ANDORRA, DFPais.valueOfCodigo(370));
         Assert.assertEquals(DFPais.ANGOLA, DFPais.valueOfCodigo("400"));
         Assert.assertEquals(DFPais.ANGOLA, DFPais.valueOfCodigo(400));
         Assert.assertEquals(DFPais.ANGUILLA, DFPais.valueOfCodigo("418"));
         Assert.assertEquals(DFPais.ANGUILLA, DFPais.valueOfCodigo(418));
         Assert.assertEquals(DFPais.ANTARTICA, DFPais.valueOfCodigo("420"));
         Assert.assertEquals(DFPais.ANTARTICA, DFPais.valueOfCodigo(420));
         Assert.assertEquals(DFPais.ANTIGUA_E_BARBUDA, DFPais.valueOfCodigo("434"));
         Assert.assertEquals(DFPais.ANTIGUA_E_BARBUDA, DFPais.valueOfCodigo(434));
         Assert.assertEquals(DFPais.ANTILHAS_HOLANDESAS, DFPais.valueOfCodigo("477"));
         Assert.assertEquals(DFPais.ANTILHAS_HOLANDESAS, DFPais.valueOfCodigo(477));
         Assert.assertEquals(DFPais.ARABIA_SAUDITA, DFPais.valueOfCodigo("531"));
         Assert.assertEquals(DFPais.ARABIA_SAUDITA, DFPais.valueOfCodigo(531));
    }

    @Test
    public void deveRetornarPorCodigo2() {
         Assert.assertEquals(DFPais.ARGELIA, DFPais.valueOfCodigo("590"));
         Assert.assertEquals(DFPais.ARGELIA, DFPais.valueOfCodigo(590));
         Assert.assertEquals(DFPais.ARGENTINA, DFPais.valueOfCodigo("639"));
         Assert.assertEquals(DFPais.ARGENTINA, DFPais.valueOfCodigo(639));
         Assert.assertEquals(DFPais.ARMENIA_REPUBLICA_DA, DFPais.valueOfCodigo("647"));
         Assert.assertEquals(DFPais.ARMENIA_REPUBLICA_DA, DFPais.valueOfCodigo(647));
         Assert.assertEquals(DFPais.ARUBA, DFPais.valueOfCodigo("655"));
         Assert.assertEquals(DFPais.ARUBA, DFPais.valueOfCodigo(655));
         Assert.assertEquals(DFPais.AUSTRALIA, DFPais.valueOfCodigo("698"));
         Assert.assertEquals(DFPais.AUSTRALIA, DFPais.valueOfCodigo(698));
         Assert.assertEquals(DFPais.AUSTRIA, DFPais.valueOfCodigo("728"));
         Assert.assertEquals(DFPais.AUSTRIA, DFPais.valueOfCodigo(728));
         Assert.assertEquals(DFPais.AZERBAIJAO_REPUBLICA_DO, DFPais.valueOfCodigo("736"));
         Assert.assertEquals(DFPais.AZERBAIJAO_REPUBLICA_DO, DFPais.valueOfCodigo(736));
         Assert.assertEquals(DFPais.BAHAMAS_ILHAS, DFPais.valueOfCodigo("779"));
         Assert.assertEquals(DFPais.BAHAMAS_ILHAS, DFPais.valueOfCodigo(779));
         Assert.assertEquals(DFPais.BAHREIN_ILHAS, DFPais.valueOfCodigo("809"));
         Assert.assertEquals(DFPais.BAHREIN_ILHAS, DFPais.valueOfCodigo(809));
         Assert.assertEquals(DFPais.BANGLADESH, DFPais.valueOfCodigo("817"));
         Assert.assertEquals(DFPais.BANGLADESH, DFPais.valueOfCodigo(817));
         Assert.assertEquals(DFPais.BARBADOS, DFPais.valueOfCodigo("833"));
         Assert.assertEquals(DFPais.BARBADOS, DFPais.valueOfCodigo(833));
         Assert.assertEquals(DFPais.BELARUS_REPUBLICA_DA, DFPais.valueOfCodigo("850"));
         Assert.assertEquals(DFPais.BELARUS_REPUBLICA_DA, DFPais.valueOfCodigo(850));
    }

    @Test
    public void deveRetornarPorCodigo3() {
         Assert.assertEquals(DFPais.BELGICA, DFPais.valueOfCodigo("876"));
         Assert.assertEquals(DFPais.BELGICA, DFPais.valueOfCodigo(876));
         Assert.assertEquals(DFPais.BELIZE, DFPais.valueOfCodigo("884"));
         Assert.assertEquals(DFPais.BELIZE, DFPais.valueOfCodigo(884));
         Assert.assertEquals(DFPais.BERMUDAS, DFPais.valueOfCodigo("906"));
         Assert.assertEquals(DFPais.BERMUDAS, DFPais.valueOfCodigo(906));
         Assert.assertEquals(DFPais.MIANMAR_BIRMANIA, DFPais.valueOfCodigo("930"));
         Assert.assertEquals(DFPais.MIANMAR_BIRMANIA, DFPais.valueOfCodigo(930));
         Assert.assertEquals(DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA, DFPais.valueOfCodigo("973"));
         Assert.assertEquals(DFPais.BOLIVIA_ESTADO_PLURINACIONAL_DA, DFPais.valueOfCodigo(973));
         Assert.assertEquals(DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA, DFPais.valueOfCodigo("981"));
         Assert.assertEquals(DFPais.BOSNIA_HERZEGOVINA_REPUBLICA_DA, DFPais.valueOfCodigo(981));
         Assert.assertEquals(DFPais.BONAIRE, DFPais.valueOfCodigo("990"));
         Assert.assertEquals(DFPais.BONAIRE, DFPais.valueOfCodigo(990));
         Assert.assertEquals(DFPais.BOTSUANA, DFPais.valueOfCodigo("1015"));
         Assert.assertEquals(DFPais.BOTSUANA, DFPais.valueOfCodigo(1015));
         Assert.assertEquals(DFPais.BOUVET_ILHA, DFPais.valueOfCodigo("1023"));
         Assert.assertEquals(DFPais.BOUVET_ILHA, DFPais.valueOfCodigo(1023));
         Assert.assertEquals(DFPais.BRASIL, DFPais.valueOfCodigo("1058"));
         Assert.assertEquals(DFPais.BRASIL, DFPais.valueOfCodigo(1058));
         Assert.assertEquals(DFPais.BRUNEI, DFPais.valueOfCodigo("1082"));
         Assert.assertEquals(DFPais.BRUNEI, DFPais.valueOfCodigo(1082));
         Assert.assertEquals(DFPais.BULGARIA_REPUBLICA_DA, DFPais.valueOfCodigo("1112"));
         Assert.assertEquals(DFPais.BULGARIA_REPUBLICA_DA, DFPais.valueOfCodigo(1112));
    }

    @Test
    public void deveRetornarPorCodigo4() {
         Assert.assertEquals(DFPais.BURUNDI, DFPais.valueOfCodigo("1155"));
         Assert.assertEquals(DFPais.BURUNDI, DFPais.valueOfCodigo(1155));
         Assert.assertEquals(DFPais.BUTAO, DFPais.valueOfCodigo("1198"));
         Assert.assertEquals(DFPais.BUTAO, DFPais.valueOfCodigo(1198));
         Assert.assertEquals(DFPais.CABO_VERDE_REPUBLICA_DE, DFPais.valueOfCodigo("1279"));
         Assert.assertEquals(DFPais.CABO_VERDE_REPUBLICA_DE, DFPais.valueOfCodigo(1279));
         Assert.assertEquals(DFPais.CAYMAN_ILHAS, DFPais.valueOfCodigo("1376"));
         Assert.assertEquals(DFPais.CAYMAN_ILHAS, DFPais.valueOfCodigo(1376));
         Assert.assertEquals(DFPais.CAMBOJA, DFPais.valueOfCodigo("1414"));
         Assert.assertEquals(DFPais.CAMBOJA, DFPais.valueOfCodigo(1414));
         Assert.assertEquals(DFPais.CAMAROES, DFPais.valueOfCodigo("1457"));
         Assert.assertEquals(DFPais.CAMAROES, DFPais.valueOfCodigo(1457));
         Assert.assertEquals(DFPais.CANADA, DFPais.valueOfCodigo("1490"));
         Assert.assertEquals(DFPais.CANADA, DFPais.valueOfCodigo(1490));
         Assert.assertEquals(DFPais.CAZAQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo("1538"));
         Assert.assertEquals(DFPais.CAZAQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo(1538));
         Assert.assertEquals(DFPais.CATAR, DFPais.valueOfCodigo("1546"));
         Assert.assertEquals(DFPais.CATAR, DFPais.valueOfCodigo(1546));
         Assert.assertEquals(DFPais.CHILE, DFPais.valueOfCodigo("1589"));
         Assert.assertEquals(DFPais.CHILE, DFPais.valueOfCodigo(1589));
         Assert.assertEquals(DFPais.CHINA_REPUBLICA_POPULAR, DFPais.valueOfCodigo("1600"));
         Assert.assertEquals(DFPais.CHINA_REPUBLICA_POPULAR, DFPais.valueOfCodigo(1600));
         Assert.assertEquals(DFPais.FORMOSA_TAIWAN, DFPais.valueOfCodigo("1619"));
         Assert.assertEquals(DFPais.FORMOSA_TAIWAN, DFPais.valueOfCodigo(1619));
    }

    @Test
    public void deveRetornarPorCodigo5() {
         Assert.assertEquals(DFPais.CHIPRE, DFPais.valueOfCodigo("1635"));
         Assert.assertEquals(DFPais.CHIPRE, DFPais.valueOfCodigo(1635));
         Assert.assertEquals(DFPais.COCOS_KEELING_ILHAS, DFPais.valueOfCodigo("1651"));
         Assert.assertEquals(DFPais.COCOS_KEELING_ILHAS, DFPais.valueOfCodigo(1651));
         Assert.assertEquals(DFPais.COLOMBIA, DFPais.valueOfCodigo("1694"));
         Assert.assertEquals(DFPais.COLOMBIA, DFPais.valueOfCodigo(1694));
         Assert.assertEquals(DFPais.COMORES_ILHAS, DFPais.valueOfCodigo("1732"));
         Assert.assertEquals(DFPais.COMORES_ILHAS, DFPais.valueOfCodigo(1732));
         Assert.assertEquals(DFPais.CONGO, DFPais.valueOfCodigo("1775"));
         Assert.assertEquals(DFPais.CONGO, DFPais.valueOfCodigo(1775));
         Assert.assertEquals(DFPais.COOK_ILHAS, DFPais.valueOfCodigo("1830"));
         Assert.assertEquals(DFPais.COOK_ILHAS, DFPais.valueOfCodigo(1830));
         Assert.assertEquals(DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA, DFPais.valueOfCodigo("1872"));
         Assert.assertEquals(DFPais.COREIA_DO_NORTE_REP_POP_DEMOCRATICA, DFPais.valueOfCodigo(1872));
         Assert.assertEquals(DFPais.COREIA_DO_SUL_REPUBLICA_DA, DFPais.valueOfCodigo("1902"));
         Assert.assertEquals(DFPais.COREIA_DO_SUL_REPUBLICA_DA, DFPais.valueOfCodigo(1902));
         Assert.assertEquals(DFPais.COSTA_DO_MARFIM, DFPais.valueOfCodigo("1937"));
         Assert.assertEquals(DFPais.COSTA_DO_MARFIM, DFPais.valueOfCodigo(1937));
         Assert.assertEquals(DFPais.CROACIA_REPUBLICA_DA, DFPais.valueOfCodigo("1953"));
         Assert.assertEquals(DFPais.CROACIA_REPUBLICA_DA, DFPais.valueOfCodigo(1953));
         Assert.assertEquals(DFPais.COSTA_RICA, DFPais.valueOfCodigo("1961"));
         Assert.assertEquals(DFPais.COSTA_RICA, DFPais.valueOfCodigo(1961));
         Assert.assertEquals(DFPais.KUWAIT, DFPais.valueOfCodigo("1988"));
         Assert.assertEquals(DFPais.KUWAIT, DFPais.valueOfCodigo(1988));
    }

    @Test
    public void deveRetornarPorCodigo6() {
         Assert.assertEquals(DFPais.CUBA, DFPais.valueOfCodigo("1996"));
         Assert.assertEquals(DFPais.CUBA, DFPais.valueOfCodigo(1996));
         Assert.assertEquals(DFPais.CURACAO, DFPais.valueOfCodigo("2003"));
         Assert.assertEquals(DFPais.CURACAO, DFPais.valueOfCodigo(2003));
         Assert.assertEquals(DFPais.BENIN, DFPais.valueOfCodigo("2291"));
         Assert.assertEquals(DFPais.BENIN, DFPais.valueOfCodigo(2291));
         Assert.assertEquals(DFPais.DINAMARCA, DFPais.valueOfCodigo("2321"));
         Assert.assertEquals(DFPais.DINAMARCA, DFPais.valueOfCodigo(2321));
         Assert.assertEquals(DFPais.DOMINICA_ILHA, DFPais.valueOfCodigo("2356"));
         Assert.assertEquals(DFPais.DOMINICA_ILHA, DFPais.valueOfCodigo(2356));
         Assert.assertEquals(DFPais.EQUADOR, DFPais.valueOfCodigo("2399"));
         Assert.assertEquals(DFPais.EQUADOR, DFPais.valueOfCodigo(2399));
         Assert.assertEquals(DFPais.EGITO, DFPais.valueOfCodigo("2402"));
         Assert.assertEquals(DFPais.EGITO, DFPais.valueOfCodigo(2402));
         Assert.assertEquals(DFPais.ERITREIA, DFPais.valueOfCodigo("2437"));
         Assert.assertEquals(DFPais.ERITREIA, DFPais.valueOfCodigo(2437));
         Assert.assertEquals(DFPais.EMIRADOS_ARABES_UNIDOS, DFPais.valueOfCodigo("2445"));
         Assert.assertEquals(DFPais.EMIRADOS_ARABES_UNIDOS, DFPais.valueOfCodigo(2445));
         Assert.assertEquals(DFPais.ESPANHA, DFPais.valueOfCodigo("2453"));
         Assert.assertEquals(DFPais.ESPANHA, DFPais.valueOfCodigo(2453));
         Assert.assertEquals(DFPais.ESLOVENIA_REPUBLICA_DA, DFPais.valueOfCodigo("2461"));
         Assert.assertEquals(DFPais.ESLOVENIA_REPUBLICA_DA, DFPais.valueOfCodigo(2461));
         Assert.assertEquals(DFPais.ESLOVACA_REPUBLICA, DFPais.valueOfCodigo("2470"));
         Assert.assertEquals(DFPais.ESLOVACA_REPUBLICA, DFPais.valueOfCodigo(2470));
    }

    @Test
    public void deveRetornarPorCodigo7() {
         Assert.assertEquals(DFPais.ESTADOS_UNIDOS, DFPais.valueOfCodigo("2496"));
         Assert.assertEquals(DFPais.ESTADOS_UNIDOS, DFPais.valueOfCodigo(2496));
         Assert.assertEquals(DFPais.ESTONIA_REPUBLICA_DA, DFPais.valueOfCodigo("2518"));
         Assert.assertEquals(DFPais.ESTONIA_REPUBLICA_DA, DFPais.valueOfCodigo(2518));
         Assert.assertEquals(DFPais.ETIOPIA, DFPais.valueOfCodigo("2534"));
         Assert.assertEquals(DFPais.ETIOPIA, DFPais.valueOfCodigo(2534));
         Assert.assertEquals(DFPais.FALKLAND_ILHAS_MALVINAS, DFPais.valueOfCodigo("2550"));
         Assert.assertEquals(DFPais.FALKLAND_ILHAS_MALVINAS, DFPais.valueOfCodigo(2550));
         Assert.assertEquals(DFPais.FEROE_ILHAS, DFPais.valueOfCodigo("2593"));
         Assert.assertEquals(DFPais.FEROE_ILHAS, DFPais.valueOfCodigo(2593));
         Assert.assertEquals(DFPais.FILIPINAS, DFPais.valueOfCodigo("2674"));
         Assert.assertEquals(DFPais.FILIPINAS, DFPais.valueOfCodigo(2674));
         Assert.assertEquals(DFPais.FINLANDIA, DFPais.valueOfCodigo("2712"));
         Assert.assertEquals(DFPais.FINLANDIA, DFPais.valueOfCodigo(2712));
         Assert.assertEquals(DFPais.FRANCA, DFPais.valueOfCodigo("2755"));
         Assert.assertEquals(DFPais.FRANCA, DFPais.valueOfCodigo(2755));
         Assert.assertEquals(DFPais.GABAO, DFPais.valueOfCodigo("2810"));
         Assert.assertEquals(DFPais.GABAO, DFPais.valueOfCodigo(2810));
         Assert.assertEquals(DFPais.GAMBIA, DFPais.valueOfCodigo("2852"));
         Assert.assertEquals(DFPais.GAMBIA, DFPais.valueOfCodigo(2852));
         Assert.assertEquals(DFPais.GANA, DFPais.valueOfCodigo("2895"));
         Assert.assertEquals(DFPais.GANA, DFPais.valueOfCodigo(2895));
         Assert.assertEquals(DFPais.GEORGIA_REPUBLICA_DA, DFPais.valueOfCodigo("2917"));
         Assert.assertEquals(DFPais.GEORGIA_REPUBLICA_DA, DFPais.valueOfCodigo(2917));
    }

    @Test
    public void deveRetornarPorCodigo8() {
         Assert.assertEquals(DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL, DFPais.valueOfCodigo("2925"));
         Assert.assertEquals(DFPais.ILHAS_GEORGIA_DO_SUL_E_SANDWICH_DO_SUL, DFPais.valueOfCodigo(2925));
         Assert.assertEquals(DFPais.GIBRALTAR, DFPais.valueOfCodigo("2933"));
         Assert.assertEquals(DFPais.GIBRALTAR, DFPais.valueOfCodigo(2933));
         Assert.assertEquals(DFPais.GRANADA, DFPais.valueOfCodigo("2976"));
         Assert.assertEquals(DFPais.GRANADA, DFPais.valueOfCodigo(2976));
         Assert.assertEquals(DFPais.GRECIA, DFPais.valueOfCodigo("3018"));
         Assert.assertEquals(DFPais.GRECIA, DFPais.valueOfCodigo(3018));
         Assert.assertEquals(DFPais.GROENLANDIA, DFPais.valueOfCodigo("3050"));
         Assert.assertEquals(DFPais.GROENLANDIA, DFPais.valueOfCodigo(3050));
         Assert.assertEquals(DFPais.GUADALUPE, DFPais.valueOfCodigo("3093"));
         Assert.assertEquals(DFPais.GUADALUPE, DFPais.valueOfCodigo(3093));
         Assert.assertEquals(DFPais.GUAM, DFPais.valueOfCodigo("3131"));
         Assert.assertEquals(DFPais.GUAM, DFPais.valueOfCodigo(3131));
         Assert.assertEquals(DFPais.GUATEMALA, DFPais.valueOfCodigo("3174"));
         Assert.assertEquals(DFPais.GUATEMALA, DFPais.valueOfCodigo(3174));
         Assert.assertEquals(DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK, DFPais.valueOfCodigo("3212"));
         Assert.assertEquals(DFPais.GUERNSEY_ILHA_DO_CANAL_INCLUI_ALDERNEY_E_SARK, DFPais.valueOfCodigo(3212));
         Assert.assertEquals(DFPais.GUIANA_FRANCESA, DFPais.valueOfCodigo("3255"));
         Assert.assertEquals(DFPais.GUIANA_FRANCESA, DFPais.valueOfCodigo(3255));
         Assert.assertEquals(DFPais.GUINE, DFPais.valueOfCodigo("3298"));
         Assert.assertEquals(DFPais.GUINE, DFPais.valueOfCodigo(3298));
         Assert.assertEquals(DFPais.GUINE_EQUATORIAL, DFPais.valueOfCodigo("3310"));
         Assert.assertEquals(DFPais.GUINE_EQUATORIAL, DFPais.valueOfCodigo(3310));
    }

    @Test
    public void deveRetornarPorCodigo9() {
         Assert.assertEquals(DFPais.GUINE_BISSAU, DFPais.valueOfCodigo("3344"));
         Assert.assertEquals(DFPais.GUINE_BISSAU, DFPais.valueOfCodigo(3344));
         Assert.assertEquals(DFPais.GUIANA, DFPais.valueOfCodigo("3379"));
         Assert.assertEquals(DFPais.GUIANA, DFPais.valueOfCodigo(3379));
         Assert.assertEquals(DFPais.HAITI, DFPais.valueOfCodigo("3417"));
         Assert.assertEquals(DFPais.HAITI, DFPais.valueOfCodigo(3417));
         Assert.assertEquals(DFPais.ILHA_HEARD_E_ILHAS_MCDONALD, DFPais.valueOfCodigo("3433"));
         Assert.assertEquals(DFPais.ILHA_HEARD_E_ILHAS_MCDONALD, DFPais.valueOfCodigo(3433));
         Assert.assertEquals(DFPais.HONDURAS, DFPais.valueOfCodigo("3450"));
         Assert.assertEquals(DFPais.HONDURAS, DFPais.valueOfCodigo(3450));
         Assert.assertEquals(DFPais.HONG_KONG, DFPais.valueOfCodigo("3514"));
         Assert.assertEquals(DFPais.HONG_KONG, DFPais.valueOfCodigo(3514));
         Assert.assertEquals(DFPais.HUNGRIA_REPUBLICA_DA, DFPais.valueOfCodigo("3557"));
         Assert.assertEquals(DFPais.HUNGRIA_REPUBLICA_DA, DFPais.valueOfCodigo(3557));
         Assert.assertEquals(DFPais.IEMEN, DFPais.valueOfCodigo("3573"));
         Assert.assertEquals(DFPais.IEMEN, DFPais.valueOfCodigo(3573));
         Assert.assertEquals(DFPais.MAN_ILHA_DE, DFPais.valueOfCodigo("3595"));
         Assert.assertEquals(DFPais.MAN_ILHA_DE, DFPais.valueOfCodigo(3595));
         Assert.assertEquals(DFPais.INDIA, DFPais.valueOfCodigo("3611"));
         Assert.assertEquals(DFPais.INDIA, DFPais.valueOfCodigo(3611));
         Assert.assertEquals(DFPais.INDONESIA, DFPais.valueOfCodigo("3654"));
         Assert.assertEquals(DFPais.INDONESIA, DFPais.valueOfCodigo(3654));
         Assert.assertEquals(DFPais.IRAQUE, DFPais.valueOfCodigo("3697"));
         Assert.assertEquals(DFPais.IRAQUE, DFPais.valueOfCodigo(3697));
    }

    @Test
    public void deveRetornarPorCodigo10() {
         Assert.assertEquals(DFPais.IRA_REPUBLICA_ISLAMICA_DO, DFPais.valueOfCodigo("3727"));
         Assert.assertEquals(DFPais.IRA_REPUBLICA_ISLAMICA_DO, DFPais.valueOfCodigo(3727));
         Assert.assertEquals(DFPais.IRLANDA, DFPais.valueOfCodigo("3751"));
         Assert.assertEquals(DFPais.IRLANDA, DFPais.valueOfCodigo(3751));
         Assert.assertEquals(DFPais.ISLANDIA, DFPais.valueOfCodigo("3794"));
         Assert.assertEquals(DFPais.ISLANDIA, DFPais.valueOfCodigo(3794));
         Assert.assertEquals(DFPais.ISRAEL, DFPais.valueOfCodigo("3832"));
         Assert.assertEquals(DFPais.ISRAEL, DFPais.valueOfCodigo(3832));
         Assert.assertEquals(DFPais.ITALIA, DFPais.valueOfCodigo("3867"));
         Assert.assertEquals(DFPais.ITALIA, DFPais.valueOfCodigo(3867));
         Assert.assertEquals(DFPais.JAMAICA, DFPais.valueOfCodigo("3913"));
         Assert.assertEquals(DFPais.JAMAICA, DFPais.valueOfCodigo(3913));
         Assert.assertEquals(DFPais.JERSEY_ILHA_DO_CANAL, DFPais.valueOfCodigo("3930"));
         Assert.assertEquals(DFPais.JERSEY_ILHA_DO_CANAL, DFPais.valueOfCodigo(3930));
         Assert.assertEquals(DFPais.JOHNSTON_ILHAS, DFPais.valueOfCodigo("3964"));
         Assert.assertEquals(DFPais.JOHNSTON_ILHAS, DFPais.valueOfCodigo(3964));
         Assert.assertEquals(DFPais.JAPAO, DFPais.valueOfCodigo("3999"));
         Assert.assertEquals(DFPais.JAPAO, DFPais.valueOfCodigo(3999));
         Assert.assertEquals(DFPais.JORDANIA, DFPais.valueOfCodigo("4030"));
         Assert.assertEquals(DFPais.JORDANIA, DFPais.valueOfCodigo(4030));
         Assert.assertEquals(DFPais.KIRIBATI, DFPais.valueOfCodigo("4111"));
         Assert.assertEquals(DFPais.KIRIBATI, DFPais.valueOfCodigo(4111));
         Assert.assertEquals(DFPais.LAOS_REP_POP_DEMOCR_DO, DFPais.valueOfCodigo("4200"));
         Assert.assertEquals(DFPais.LAOS_REP_POP_DEMOCR_DO, DFPais.valueOfCodigo(4200));
    }

    @Test
    public void deveRetornarPorCodigo11() {
         Assert.assertEquals(DFPais.LEBUAN_ILHAS, DFPais.valueOfCodigo("4235"));
         Assert.assertEquals(DFPais.LEBUAN_ILHAS, DFPais.valueOfCodigo(4235));
         Assert.assertEquals(DFPais.LESOTO, DFPais.valueOfCodigo("4260"));
         Assert.assertEquals(DFPais.LESOTO, DFPais.valueOfCodigo(4260));
         Assert.assertEquals(DFPais.LETONIA_REPUBLICA_DA, DFPais.valueOfCodigo("4278"));
         Assert.assertEquals(DFPais.LETONIA_REPUBLICA_DA, DFPais.valueOfCodigo(4278));
         Assert.assertEquals(DFPais.LIBANO, DFPais.valueOfCodigo("4316"));
         Assert.assertEquals(DFPais.LIBANO, DFPais.valueOfCodigo(4316));
         Assert.assertEquals(DFPais.LIBERIA, DFPais.valueOfCodigo("4340"));
         Assert.assertEquals(DFPais.LIBERIA, DFPais.valueOfCodigo(4340));
         Assert.assertEquals(DFPais.LIBIA, DFPais.valueOfCodigo("4383"));
         Assert.assertEquals(DFPais.LIBIA, DFPais.valueOfCodigo(4383));
         Assert.assertEquals(DFPais.LIECHTENSTEIN, DFPais.valueOfCodigo("4405"));
         Assert.assertEquals(DFPais.LIECHTENSTEIN, DFPais.valueOfCodigo(4405));
         Assert.assertEquals(DFPais.LITUANIA_REPUBLICA_DA, DFPais.valueOfCodigo("4421"));
         Assert.assertEquals(DFPais.LITUANIA_REPUBLICA_DA, DFPais.valueOfCodigo(4421));
         Assert.assertEquals(DFPais.LUXEMBURGO, DFPais.valueOfCodigo("4456"));
         Assert.assertEquals(DFPais.LUXEMBURGO, DFPais.valueOfCodigo(4456));
         Assert.assertEquals(DFPais.MACAU, DFPais.valueOfCodigo("4472"));
         Assert.assertEquals(DFPais.MACAU, DFPais.valueOfCodigo(4472));
         Assert.assertEquals(DFPais.MACEDONIA_ANT_REP_IUGOSLAVA, DFPais.valueOfCodigo("4499"));
         Assert.assertEquals(DFPais.MACEDONIA_ANT_REP_IUGOSLAVA, DFPais.valueOfCodigo(4499));
         Assert.assertEquals(DFPais.MADAGASCAR, DFPais.valueOfCodigo("4502"));
         Assert.assertEquals(DFPais.MADAGASCAR, DFPais.valueOfCodigo(4502));
    }

    @Test
    public void deveRetornarPorCodigo12() {
         Assert.assertEquals(DFPais.MADEIRA_ILHA_DA, DFPais.valueOfCodigo("4525"));
         Assert.assertEquals(DFPais.MADEIRA_ILHA_DA, DFPais.valueOfCodigo(4525));
         Assert.assertEquals(DFPais.MALASIA, DFPais.valueOfCodigo("4553"));
         Assert.assertEquals(DFPais.MALASIA, DFPais.valueOfCodigo(4553));
         Assert.assertEquals(DFPais.MALAVI, DFPais.valueOfCodigo("4588"));
         Assert.assertEquals(DFPais.MALAVI, DFPais.valueOfCodigo(4588));
         Assert.assertEquals(DFPais.MALDIVAS, DFPais.valueOfCodigo("4618"));
         Assert.assertEquals(DFPais.MALDIVAS, DFPais.valueOfCodigo(4618));
         Assert.assertEquals(DFPais.MALI, DFPais.valueOfCodigo("4642"));
         Assert.assertEquals(DFPais.MALI, DFPais.valueOfCodigo(4642));
         Assert.assertEquals(DFPais.MALTA, DFPais.valueOfCodigo("4677"));
         Assert.assertEquals(DFPais.MALTA, DFPais.valueOfCodigo(4677));
         Assert.assertEquals(DFPais.MARIANAS_DO_NORTE, DFPais.valueOfCodigo("4723"));
         Assert.assertEquals(DFPais.MARIANAS_DO_NORTE, DFPais.valueOfCodigo(4723));
         Assert.assertEquals(DFPais.MARROCOS, DFPais.valueOfCodigo("4740"));
         Assert.assertEquals(DFPais.MARROCOS, DFPais.valueOfCodigo(4740));
         Assert.assertEquals(DFPais.MARSHALL_ILHAS, DFPais.valueOfCodigo("4766"));
         Assert.assertEquals(DFPais.MARSHALL_ILHAS, DFPais.valueOfCodigo(4766));
         Assert.assertEquals(DFPais.MARTINICA, DFPais.valueOfCodigo("4774"));
         Assert.assertEquals(DFPais.MARTINICA, DFPais.valueOfCodigo(4774));
         Assert.assertEquals(DFPais.MAURICIO, DFPais.valueOfCodigo("4855"));
         Assert.assertEquals(DFPais.MAURICIO, DFPais.valueOfCodigo(4855));
         Assert.assertEquals(DFPais.MAURITANIA, DFPais.valueOfCodigo("4880"));
         Assert.assertEquals(DFPais.MAURITANIA, DFPais.valueOfCodigo(4880));
    }

    @Test
    public void deveRetornarPorCodigo13() {
         Assert.assertEquals(DFPais.MAYOTTE_ILHAS_FRANCESAS, DFPais.valueOfCodigo("4898"));
         Assert.assertEquals(DFPais.MAYOTTE_ILHAS_FRANCESAS, DFPais.valueOfCodigo(4898));
         Assert.assertEquals(DFPais.MIDWAY_ILHAS, DFPais.valueOfCodigo("4901"));
         Assert.assertEquals(DFPais.MIDWAY_ILHAS, DFPais.valueOfCodigo(4901));
         Assert.assertEquals(DFPais.MEXICO, DFPais.valueOfCodigo("4936"));
         Assert.assertEquals(DFPais.MEXICO, DFPais.valueOfCodigo(4936));
         Assert.assertEquals(DFPais.MOLDAVIA_REPUBLICA_DA, DFPais.valueOfCodigo("4944"));
         Assert.assertEquals(DFPais.MOLDAVIA_REPUBLICA_DA, DFPais.valueOfCodigo(4944));
         Assert.assertEquals(DFPais.MONACO, DFPais.valueOfCodigo("4952"));
         Assert.assertEquals(DFPais.MONACO, DFPais.valueOfCodigo(4952));
         Assert.assertEquals(DFPais.MONGOLIA, DFPais.valueOfCodigo("4979"));
         Assert.assertEquals(DFPais.MONGOLIA, DFPais.valueOfCodigo(4979));
         Assert.assertEquals(DFPais.MONTENEGRO, DFPais.valueOfCodigo("4985"));
         Assert.assertEquals(DFPais.MONTENEGRO, DFPais.valueOfCodigo(4985));
         Assert.assertEquals(DFPais.MICRONESIA, DFPais.valueOfCodigo("4995"));
         Assert.assertEquals(DFPais.MICRONESIA, DFPais.valueOfCodigo(4995));
         Assert.assertEquals(DFPais.MONTSERRAT_ILHAS, DFPais.valueOfCodigo("5010"));
         Assert.assertEquals(DFPais.MONTSERRAT_ILHAS, DFPais.valueOfCodigo(5010));
         Assert.assertEquals(DFPais.MOCAMBIQUE, DFPais.valueOfCodigo("5053"));
         Assert.assertEquals(DFPais.MOCAMBIQUE, DFPais.valueOfCodigo(5053));
         Assert.assertEquals(DFPais.NAMIBIA, DFPais.valueOfCodigo("5070"));
         Assert.assertEquals(DFPais.NAMIBIA, DFPais.valueOfCodigo(5070));
         Assert.assertEquals(DFPais.NAURU, DFPais.valueOfCodigo("5088"));
         Assert.assertEquals(DFPais.NAURU, DFPais.valueOfCodigo(5088));
    }

    @Test
    public void deveRetornarPorCodigo14() {
         Assert.assertEquals(DFPais.CHRISTMAS_ILHA_NAVIDAD, DFPais.valueOfCodigo("5118"));
         Assert.assertEquals(DFPais.CHRISTMAS_ILHA_NAVIDAD, DFPais.valueOfCodigo(5118));
         Assert.assertEquals(DFPais.NEPAL, DFPais.valueOfCodigo("5177"));
         Assert.assertEquals(DFPais.NEPAL, DFPais.valueOfCodigo(5177));
         Assert.assertEquals(DFPais.NICARAGUA, DFPais.valueOfCodigo("5215"));
         Assert.assertEquals(DFPais.NICARAGUA, DFPais.valueOfCodigo(5215));
         Assert.assertEquals(DFPais.NIGER, DFPais.valueOfCodigo("5258"));
         Assert.assertEquals(DFPais.NIGER, DFPais.valueOfCodigo(5258));
         Assert.assertEquals(DFPais.NIGERIA, DFPais.valueOfCodigo("5282"));
         Assert.assertEquals(DFPais.NIGERIA, DFPais.valueOfCodigo(5282));
         Assert.assertEquals(DFPais.NIUE_ILHA, DFPais.valueOfCodigo("5312"));
         Assert.assertEquals(DFPais.NIUE_ILHA, DFPais.valueOfCodigo(5312));
         Assert.assertEquals(DFPais.NORFOLK_ILHA, DFPais.valueOfCodigo("5355"));
         Assert.assertEquals(DFPais.NORFOLK_ILHA, DFPais.valueOfCodigo(5355));
         Assert.assertEquals(DFPais.NORUEGA, DFPais.valueOfCodigo("5380"));
         Assert.assertEquals(DFPais.NORUEGA, DFPais.valueOfCodigo(5380));
         Assert.assertEquals(DFPais.NOVA_CALEDONIA, DFPais.valueOfCodigo("5428"));
         Assert.assertEquals(DFPais.NOVA_CALEDONIA, DFPais.valueOfCodigo(5428));
         Assert.assertEquals(DFPais.PAPUA_NOVA_GUINE, DFPais.valueOfCodigo("5452"));
         Assert.assertEquals(DFPais.PAPUA_NOVA_GUINE, DFPais.valueOfCodigo(5452));
         Assert.assertEquals(DFPais.NOVA_ZELANDIA, DFPais.valueOfCodigo("5487"));
         Assert.assertEquals(DFPais.NOVA_ZELANDIA, DFPais.valueOfCodigo(5487));
         Assert.assertEquals(DFPais.VANUATU, DFPais.valueOfCodigo("5517"));
         Assert.assertEquals(DFPais.VANUATU, DFPais.valueOfCodigo(5517));
    }

    @Test
    public void deveRetornarPorCodigo15() {
         Assert.assertEquals(DFPais.OMA, DFPais.valueOfCodigo("5568"));
         Assert.assertEquals(DFPais.OMA, DFPais.valueOfCodigo(5568));
         Assert.assertEquals(DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA, DFPais.valueOfCodigo("5665"));
         Assert.assertEquals(DFPais.PACIFICO_ILHAS_DO_POSSESSAO_DOS_EUA, DFPais.valueOfCodigo(5665));
         Assert.assertEquals(DFPais.PAISES_BAIXOS_HOLANDA, DFPais.valueOfCodigo("5738"));
         Assert.assertEquals(DFPais.PAISES_BAIXOS_HOLANDA, DFPais.valueOfCodigo(5738));
         Assert.assertEquals(DFPais.PALAU, DFPais.valueOfCodigo("5754"));
         Assert.assertEquals(DFPais.PALAU, DFPais.valueOfCodigo(5754));
         Assert.assertEquals(DFPais.PAQUISTAO, DFPais.valueOfCodigo("5762"));
         Assert.assertEquals(DFPais.PAQUISTAO, DFPais.valueOfCodigo(5762));
         Assert.assertEquals(DFPais.PALESTINA, DFPais.valueOfCodigo("5780"));
         Assert.assertEquals(DFPais.PALESTINA, DFPais.valueOfCodigo(5780));
         Assert.assertEquals(DFPais.PANAMA, DFPais.valueOfCodigo("5800"));
         Assert.assertEquals(DFPais.PANAMA, DFPais.valueOfCodigo(5800));
         Assert.assertEquals(DFPais.PARAGUAI, DFPais.valueOfCodigo("5860"));
         Assert.assertEquals(DFPais.PARAGUAI, DFPais.valueOfCodigo(5860));
         Assert.assertEquals(DFPais.PERU, DFPais.valueOfCodigo("5894"));
         Assert.assertEquals(DFPais.PERU, DFPais.valueOfCodigo(5894));
         Assert.assertEquals(DFPais.PITCAIRN_ILHA, DFPais.valueOfCodigo("5932"));
         Assert.assertEquals(DFPais.PITCAIRN_ILHA, DFPais.valueOfCodigo(5932));
         Assert.assertEquals(DFPais.POLINESIA_FRANCESA, DFPais.valueOfCodigo("5991"));
         Assert.assertEquals(DFPais.POLINESIA_FRANCESA, DFPais.valueOfCodigo(5991));
         Assert.assertEquals(DFPais.POLONIA_REPUBLICA_DA, DFPais.valueOfCodigo("6033"));
         Assert.assertEquals(DFPais.POLONIA_REPUBLICA_DA, DFPais.valueOfCodigo(6033));
    }

    @Test
    public void deveRetornarPorCodigo16() {
         Assert.assertEquals(DFPais.PORTUGAL, DFPais.valueOfCodigo("6076"));
         Assert.assertEquals(DFPais.PORTUGAL, DFPais.valueOfCodigo(6076));
         Assert.assertEquals(DFPais.PORTO_RICO, DFPais.valueOfCodigo("6114"));
         Assert.assertEquals(DFPais.PORTO_RICO, DFPais.valueOfCodigo(6114));
         Assert.assertEquals(DFPais.QUENIA, DFPais.valueOfCodigo("6238"));
         Assert.assertEquals(DFPais.QUENIA, DFPais.valueOfCodigo(6238));
         Assert.assertEquals(DFPais.QUIRGUIZ_REPUBLICA, DFPais.valueOfCodigo("6254"));
         Assert.assertEquals(DFPais.QUIRGUIZ_REPUBLICA, DFPais.valueOfCodigo(6254));
         Assert.assertEquals(DFPais.REINO_UNIDO, DFPais.valueOfCodigo("6289"));
         Assert.assertEquals(DFPais.REINO_UNIDO, DFPais.valueOfCodigo(6289));
         Assert.assertEquals(DFPais.REPUBLICA_CENTRO_AFRICANA, DFPais.valueOfCodigo("6408"));
         Assert.assertEquals(DFPais.REPUBLICA_CENTRO_AFRICANA, DFPais.valueOfCodigo(6408));
         Assert.assertEquals(DFPais.REPUBLICA_DOMINICANA, DFPais.valueOfCodigo("6475"));
         Assert.assertEquals(DFPais.REPUBLICA_DOMINICANA, DFPais.valueOfCodigo(6475));
         Assert.assertEquals(DFPais.REUNIAO_ILHA, DFPais.valueOfCodigo("6602"));
         Assert.assertEquals(DFPais.REUNIAO_ILHA, DFPais.valueOfCodigo(6602));
         Assert.assertEquals(DFPais.ZIMBABUE, DFPais.valueOfCodigo("6653"));
         Assert.assertEquals(DFPais.ZIMBABUE, DFPais.valueOfCodigo(6653));
         Assert.assertEquals(DFPais.ROMENIA, DFPais.valueOfCodigo("6700"));
         Assert.assertEquals(DFPais.ROMENIA, DFPais.valueOfCodigo(6700));
         Assert.assertEquals(DFPais.RUANDA, DFPais.valueOfCodigo("6750"));
         Assert.assertEquals(DFPais.RUANDA, DFPais.valueOfCodigo(6750));
         Assert.assertEquals(DFPais.RUSSIA_FEDERACAO_DA, DFPais.valueOfCodigo("6769"));
         Assert.assertEquals(DFPais.RUSSIA_FEDERACAO_DA, DFPais.valueOfCodigo(6769));
    }

    @Test
    public void deveRetornarPorCodigo17() {
         Assert.assertEquals(DFPais.SALOMAO_ILHAS, DFPais.valueOfCodigo("6777"));
         Assert.assertEquals(DFPais.SALOMAO_ILHAS, DFPais.valueOfCodigo(6777));
         Assert.assertEquals(DFPais.SAARA_OCIDENTAL, DFPais.valueOfCodigo("6858"));
         Assert.assertEquals(DFPais.SAARA_OCIDENTAL, DFPais.valueOfCodigo(6858));
         Assert.assertEquals(DFPais.EL_SALVADOR, DFPais.valueOfCodigo("6874"));
         Assert.assertEquals(DFPais.EL_SALVADOR, DFPais.valueOfCodigo(6874));
         Assert.assertEquals(DFPais.SAMOA, DFPais.valueOfCodigo("6904"));
         Assert.assertEquals(DFPais.SAMOA, DFPais.valueOfCodigo(6904));
         Assert.assertEquals(DFPais.SAMOA_AMERICANA, DFPais.valueOfCodigo("6912"));
         Assert.assertEquals(DFPais.SAMOA_AMERICANA, DFPais.valueOfCodigo(6912));
         Assert.assertEquals(DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS, DFPais.valueOfCodigo("6955"));
         Assert.assertEquals(DFPais.SAO_CRISTOVAO_E_NEVES_ILHAS, DFPais.valueOfCodigo(6955));
         Assert.assertEquals(DFPais.SAO_BARTOLOMEU, DFPais.valueOfCodigo("6939"));
         Assert.assertEquals(DFPais.SAO_BARTOLOMEU, DFPais.valueOfCodigo(6939));
         Assert.assertEquals(DFPais.SAN_MARINO, DFPais.valueOfCodigo("6971"));
         Assert.assertEquals(DFPais.SAN_MARINO, DFPais.valueOfCodigo(6971));
         Assert.assertEquals(DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA, DFPais.valueOfCodigo("6980"));
         Assert.assertEquals(DFPais.ILHAS_DE_SAO_MARTINHO_PARTE_FRANCESA, DFPais.valueOfCodigo(6980));
         Assert.assertEquals(DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA, DFPais.valueOfCodigo("6998"));
         Assert.assertEquals(DFPais.SAO_MARTINHO_ILHA_DE_PARTE_FRANCESA, DFPais.valueOfCodigo(6998));
         Assert.assertEquals(DFPais.SAO_PEDRO_E_MIQUELON, DFPais.valueOfCodigo("7005"));
         Assert.assertEquals(DFPais.SAO_PEDRO_E_MIQUELON, DFPais.valueOfCodigo(7005));
         Assert.assertEquals(DFPais.SAO_VICENTE_E_GRANADINAS, DFPais.valueOfCodigo("7056"));
         Assert.assertEquals(DFPais.SAO_VICENTE_E_GRANADINAS, DFPais.valueOfCodigo(7056));
    }

    @Test
    public void deveRetornarPorCodigo18() {
         Assert.assertEquals(DFPais.SANTA_HELENA, DFPais.valueOfCodigo("7102"));
         Assert.assertEquals(DFPais.SANTA_HELENA, DFPais.valueOfCodigo(7102));
         Assert.assertEquals(DFPais.SANTA_LUCIA, DFPais.valueOfCodigo("7153"));
         Assert.assertEquals(DFPais.SANTA_LUCIA, DFPais.valueOfCodigo(7153));
         Assert.assertEquals(DFPais.SAO_TOME_E_PRINCIPE_ILHAS, DFPais.valueOfCodigo("7200"));
         Assert.assertEquals(DFPais.SAO_TOME_E_PRINCIPE_ILHAS, DFPais.valueOfCodigo(7200));
         Assert.assertEquals(DFPais.SENEGAL, DFPais.valueOfCodigo("7285"));
         Assert.assertEquals(DFPais.SENEGAL, DFPais.valueOfCodigo(7285));
         Assert.assertEquals(DFPais.SEYCHELLES, DFPais.valueOfCodigo("7315"));
         Assert.assertEquals(DFPais.SEYCHELLES, DFPais.valueOfCodigo(7315));
         Assert.assertEquals(DFPais.SERRA_LEOA, DFPais.valueOfCodigo("7358"));
         Assert.assertEquals(DFPais.SERRA_LEOA, DFPais.valueOfCodigo(7358));
         Assert.assertEquals(DFPais.SERVIA, DFPais.valueOfCodigo("7370"));
         Assert.assertEquals(DFPais.SERVIA, DFPais.valueOfCodigo(7370));
         Assert.assertEquals(DFPais.CINGAPURA, DFPais.valueOfCodigo("7412"));
         Assert.assertEquals(DFPais.CINGAPURA, DFPais.valueOfCodigo(7412));
         Assert.assertEquals(DFPais.SIRIA_REPUBLICA_ARABE_DA, DFPais.valueOfCodigo("7447"));
         Assert.assertEquals(DFPais.SIRIA_REPUBLICA_ARABE_DA, DFPais.valueOfCodigo(7447));
         Assert.assertEquals(DFPais.SOMALIA, DFPais.valueOfCodigo("7480"));
         Assert.assertEquals(DFPais.SOMALIA, DFPais.valueOfCodigo(7480));
         Assert.assertEquals(DFPais.SRI_LANKA, DFPais.valueOfCodigo("7501"));
         Assert.assertEquals(DFPais.SRI_LANKA, DFPais.valueOfCodigo(7501));
         Assert.assertEquals(DFPais.SUAZILANDIA, DFPais.valueOfCodigo("7544"));
         Assert.assertEquals(DFPais.SUAZILANDIA, DFPais.valueOfCodigo(7544));
    }

    @Test
    public void deveRetornarPorCodigo19() {
         Assert.assertEquals(DFPais.SVALBARD_E_JAN_MAYERN, DFPais.valueOfCodigo("7552"));
         Assert.assertEquals(DFPais.SVALBARD_E_JAN_MAYERN, DFPais.valueOfCodigo(7552));
         Assert.assertEquals(DFPais.AFRICA_DO_SUL, DFPais.valueOfCodigo("7560"));
         Assert.assertEquals(DFPais.AFRICA_DO_SUL, DFPais.valueOfCodigo(7560));
         Assert.assertEquals(DFPais.SUDAO, DFPais.valueOfCodigo("7595"));
         Assert.assertEquals(DFPais.SUDAO, DFPais.valueOfCodigo(7595));
         Assert.assertEquals(DFPais.SUD_O_DO_SUL, DFPais.valueOfCodigo("7600"));
         Assert.assertEquals(DFPais.SUD_O_DO_SUL, DFPais.valueOfCodigo(7600));
         Assert.assertEquals(DFPais.SUECIA, DFPais.valueOfCodigo("7641"));
         Assert.assertEquals(DFPais.SUECIA, DFPais.valueOfCodigo(7641));
         Assert.assertEquals(DFPais.SUICA, DFPais.valueOfCodigo("7676"));
         Assert.assertEquals(DFPais.SUICA, DFPais.valueOfCodigo(7676));
         Assert.assertEquals(DFPais.SURINAME, DFPais.valueOfCodigo("7706"));
         Assert.assertEquals(DFPais.SURINAME, DFPais.valueOfCodigo(7706));
         Assert.assertEquals(DFPais.TADJIQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo("7722"));
         Assert.assertEquals(DFPais.TADJIQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo(7722));
         Assert.assertEquals(DFPais.TAILANDIA, DFPais.valueOfCodigo("7765"));
         Assert.assertEquals(DFPais.TAILANDIA, DFPais.valueOfCodigo(7765));
         Assert.assertEquals(DFPais.TANZANIA_REP_UNIDA_DA, DFPais.valueOfCodigo("7803"));
         Assert.assertEquals(DFPais.TANZANIA_REP_UNIDA_DA, DFPais.valueOfCodigo(7803));
         Assert.assertEquals(DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS, DFPais.valueOfCodigo("7811"));
         Assert.assertEquals(DFPais.TERRAS_AUSTRAIS_E_ANTARTICAS_FRANCESAS, DFPais.valueOfCodigo(7811));
         Assert.assertEquals(DFPais.TERRITORIO_BRIT_OC_INDICO, DFPais.valueOfCodigo("7820"));
         Assert.assertEquals(DFPais.TERRITORIO_BRIT_OC_INDICO, DFPais.valueOfCodigo(7820));
    }

    @Test
    public void deveRetornarPorCodigo20() {
         Assert.assertEquals(DFPais.DJIBUTI, DFPais.valueOfCodigo("7838"));
         Assert.assertEquals(DFPais.DJIBUTI, DFPais.valueOfCodigo(7838));
         Assert.assertEquals(DFPais.CHADE, DFPais.valueOfCodigo("7889"));
         Assert.assertEquals(DFPais.CHADE, DFPais.valueOfCodigo(7889));
         Assert.assertEquals(DFPais.TCHECA_REPUBLICA, DFPais.valueOfCodigo("7919"));
         Assert.assertEquals(DFPais.TCHECA_REPUBLICA, DFPais.valueOfCodigo(7919));
         Assert.assertEquals(DFPais.TIMOR_LESTE, DFPais.valueOfCodigo("7951"));
         Assert.assertEquals(DFPais.TIMOR_LESTE, DFPais.valueOfCodigo(7951));
         Assert.assertEquals(DFPais.TOGO, DFPais.valueOfCodigo("8001"));
         Assert.assertEquals(DFPais.TOGO, DFPais.valueOfCodigo(8001));
         Assert.assertEquals(DFPais.TOQUELAU_ILHAS, DFPais.valueOfCodigo("8052"));
         Assert.assertEquals(DFPais.TOQUELAU_ILHAS, DFPais.valueOfCodigo(8052));
         Assert.assertEquals(DFPais.TONGA, DFPais.valueOfCodigo("8109"));
         Assert.assertEquals(DFPais.TONGA, DFPais.valueOfCodigo(8109));
         Assert.assertEquals(DFPais.TRINIDAD_E_TOBAGO, DFPais.valueOfCodigo("8150"));
         Assert.assertEquals(DFPais.TRINIDAD_E_TOBAGO, DFPais.valueOfCodigo(8150));
         Assert.assertEquals(DFPais.TUNISIA, DFPais.valueOfCodigo("8206"));
         Assert.assertEquals(DFPais.TUNISIA, DFPais.valueOfCodigo(8206));
         Assert.assertEquals(DFPais.TURCAS_E_CAICOS_ILHAS, DFPais.valueOfCodigo("8230"));
         Assert.assertEquals(DFPais.TURCAS_E_CAICOS_ILHAS, DFPais.valueOfCodigo(8230));
         Assert.assertEquals(DFPais.TURCOMENISTAO_REPUBLICA_DO, DFPais.valueOfCodigo("8249"));
         Assert.assertEquals(DFPais.TURCOMENISTAO_REPUBLICA_DO, DFPais.valueOfCodigo(8249));
         Assert.assertEquals(DFPais.TURQUIA, DFPais.valueOfCodigo("8273"));
         Assert.assertEquals(DFPais.TURQUIA, DFPais.valueOfCodigo(8273));
    }

    @Test
    public void deveRetornarPorCodigo21() {
         Assert.assertEquals(DFPais.TUVALU, DFPais.valueOfCodigo("8281"));
         Assert.assertEquals(DFPais.TUVALU, DFPais.valueOfCodigo(8281));
         Assert.assertEquals(DFPais.UCRANIA, DFPais.valueOfCodigo("8311"));
         Assert.assertEquals(DFPais.UCRANIA, DFPais.valueOfCodigo(8311));
         Assert.assertEquals(DFPais.UGANDA, DFPais.valueOfCodigo("8338"));
         Assert.assertEquals(DFPais.UGANDA, DFPais.valueOfCodigo(8338));
         Assert.assertEquals(DFPais.URUGUAI, DFPais.valueOfCodigo("8451"));
         Assert.assertEquals(DFPais.URUGUAI, DFPais.valueOfCodigo(8451));
         Assert.assertEquals(DFPais.UZBEQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo("8478"));
         Assert.assertEquals(DFPais.UZBEQUISTAO_REPUBLICA_DO, DFPais.valueOfCodigo(8478));
         Assert.assertEquals(DFPais.VATICANO_EST_DA_CIDADE_DO, DFPais.valueOfCodigo("8486"));
         Assert.assertEquals(DFPais.VATICANO_EST_DA_CIDADE_DO, DFPais.valueOfCodigo(8486));
         Assert.assertEquals(DFPais.VENEZUELA, DFPais.valueOfCodigo("8508"));
         Assert.assertEquals(DFPais.VENEZUELA, DFPais.valueOfCodigo(8508));
         Assert.assertEquals(DFPais.VIETNA, DFPais.valueOfCodigo("8583"));
         Assert.assertEquals(DFPais.VIETNA, DFPais.valueOfCodigo(8583));
         Assert.assertEquals(DFPais.VIRGENS_ILHAS_BRITANICAS, DFPais.valueOfCodigo("8630"));
         Assert.assertEquals(DFPais.VIRGENS_ILHAS_BRITANICAS, DFPais.valueOfCodigo(8630));
         Assert.assertEquals(DFPais.VIRGENS_ILHAS_E_U_A, DFPais.valueOfCodigo("8664"));
         Assert.assertEquals(DFPais.VIRGENS_ILHAS_E_U_A, DFPais.valueOfCodigo(8664));
         Assert.assertEquals(DFPais.FIJI, DFPais.valueOfCodigo("8702"));
         Assert.assertEquals(DFPais.FIJI, DFPais.valueOfCodigo(8702));
         Assert.assertEquals(DFPais.WALLIS_E_FUTUNA_ILHAS, DFPais.valueOfCodigo("8753"));
         Assert.assertEquals(DFPais.WALLIS_E_FUTUNA_ILHAS, DFPais.valueOfCodigo(8753));
    }

    @Test
    public void deveRetornarPorCodigo22() {
         Assert.assertEquals(DFPais.WAKE_ILHA, DFPais.valueOfCodigo("8737"));
         Assert.assertEquals(DFPais.WAKE_ILHA, DFPais.valueOfCodigo(8737));
         Assert.assertEquals(DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO, DFPais.valueOfCodigo("8885"));
         Assert.assertEquals(DFPais.CONGO_REPUBLICA_DEMOCRATICA_DO, DFPais.valueOfCodigo(8885));
         Assert.assertEquals(DFPais.ZAMBIA, DFPais.valueOfCodigo("8907"));
         Assert.assertEquals(DFPais.ZAMBIA, DFPais.valueOfCodigo(8907));
    }

}