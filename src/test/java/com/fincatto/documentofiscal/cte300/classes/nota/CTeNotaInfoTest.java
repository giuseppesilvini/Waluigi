package com.fincatto.documentofiscal.cte300.classes.nota;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.cte300.FabricaDeObjetosFake;

public class CTeNotaInfoTest {

    @Test
    public void deveGerarXMLCorretamente() {
        final String retorno = "<infCte Id=\"CTe12345678901234567890123456789012345678901234\" versao=\"3.00\" xmlns=\"http://www.portalfiscal.inf.br/cte\"><ide><cUF>42</cUF><cCT>67890123</cCT><CFOP>5353</CFOP><natOp>Prestacao de servico de transporte</natOp><mod>57</mod><serie>1</serie><nCT>123</nCT><dhEmi>2018-01-22T10:10:10-02:00</dhEmi><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>4</cDV><tpAmb>2</tpAmb><tpCTe>0</tpCTe><procEmi>0</procEmi><verProc>1.00</verProc><indGlobalizado>1</indGlobalizado><cMunEnv>4205407</cMunEnv><xMunEnv>Floriano</xMunEnv><UFEnv>SC</UFEnv><modal>01</modal><tpServ>0</tpServ><cMunIni>4205407</cMunIni><xMunIni>Floriano</xMunIni><UFIni>SC</UFIni><cMunFim>4205407</cMunFim><xMunFim>Floriano</xMunFim><UFFim>SC</UFFim><retira>1</retira><xDetRetira>Nao retira</xDetRetira><indIEToma>9</indIEToma><toma3><toma>2</toma></toma3></ide><compl><xCaracAd>ENTREGA</xCaracAd><xCaracSer>ENTREGA</xCaracSer><xEmi>Joao da Silva</xEmi><fluxo><xOrig>Floriano</xOrig><pass><xPass>IATA</xPass></pass><xDest>Floriano</xDest><xRota>Floriano</xRota></fluxo><Entrega><comData><tpPer>1</tpPer><dProg>2018-01-22</dProg></comData></Entrega><origCalc>Floriano</origCalc><destCalc>Floriano</destCalc><xObs>Observacao geral</xObs></compl><emit><CNPJ>00000000000011</CNPJ><IE>1234567890</IE><IEST>1234567890</IEST><xNome>RAZAO SOCIAL EMITENTE</xNome><xFant>FANTASIA EMITENTE</xFant><enderEmit><xLgr>RUA ANITA GARIBALDI</xLgr><nro>1</nro><xCpl>SALA 1</xCpl><xBairro>CENTRO</xBairro><cMun>4205407</cMun><xMun>Floriano</xMun><CEP>88010500</CEP><UF>SC</UF><fone>4832000000</fone></enderEmit></emit><vPrest><vTPrest>100.00</vTPrest><vRec>100.00</vRec><Comp><xNome>FRETE</xNome><vComp>100.00</vComp></Comp></vPrest><imp><ICMS><ICMS00><CST>00</CST><vBC>100.00</vBC><pICMS>17.00</pICMS><vICMS>0.17</vICMS></ICMS00></ICMS><vTotTrib>1.00</vTotTrib><infAdFisco>Informacoes do Fisco</infAdFisco><ICMSUFFim><vBCUFFim>100.00</vBCUFFim><pFCPUFFim>1.00</pFCPUFFim><pICMSUFFim>17.00</pICMSUFFim><pICMSInter>17.00</pICMSInter><pICMSInterPart>50.00</pICMSInterPart><vFCPUFFim>1.00</vFCPUFFim><vICMSUFFim>8.50</vICMSUFFim><vICMSUFIni>8.50</vICMSUFIni></ICMSUFFim></imp><infCTeNorm><infCarga><vCarga>100000.00</vCarga><proPred>Ferro</proPred><xOutCat>Carga pesada</xOutCat><infQ><cUnid>00</cUnid><tpMed>METRO CUBICO</tpMed><qCarga>1.0000</qCarga></infQ><vCargaAverb>100000.00</vCargaAverb></infCarga><infDoc><infNFe><chave>12345678901234567890123456789012345678901234</chave><dPrev>2018-01-22</dPrev><infUnidCarga><tpUnidCarga>3</tpUnidCarga><idUnidCarga>IDE</idUnidCarga><qtdRat>1.00</qtdRat></infUnidCarga></infNFe></infDoc><infModal versaoModal=\"3.0\"><rodo><RNTRC>12345678</RNTRC><occ><nOcc>125</nOcc><dEmi>2018-01-22</dEmi><emiOcc><CNPJ>00000000000000</CNPJ><cInt>1754</cInt><IE>ISENTO</IE><UF>SC</UF><fone>4832000000</fone></emiOcc></occ></rodo></infModal><cobr><fat><nFat>1</nFat><vOrig>100.00</vOrig><vDesc>0.00</vDesc><vLiq>100.00</vLiq></fat><dup><nDup>1</nDup><dVenc>2018-01-22</dVenc><vDup>100.00</vDup></dup></cobr></infCTeNorm></infCte>";
        Assert.assertEquals(retorno, FabricaDeObjetosFake.getCTeNotaInfo().toString());
    }
}
