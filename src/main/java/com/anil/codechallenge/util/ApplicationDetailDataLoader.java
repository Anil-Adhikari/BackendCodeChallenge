package com.anil.codechallenge.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.entities.ApplicationPartDetail;
import com.anil.codechallenge.entities.AssyPN;
import com.anil.codechallenge.entities.FunctionalType;
import com.anil.codechallenge.entities.MGMFile;
import com.anil.codechallenge.entities.Protocol;
import com.anil.codechallenge.entities.Values;
import com.anil.codechallenge.enums.NetworkProtocol;

public class ApplicationDetailDataLoader {

	public static ApplicationDetail createApplicationDetail() {
		ApplicationDetail applicationDetail = new ApplicationDetail();

		applicationDetail.setSubtype("Application1");
		applicationDetail.setValues(getValues());
		applicationDetail.setApplicationPartDetail(getApplicationPartDetail());
		applicationDetail.setApplicationDescription("Test Application to run certain features in the vehicle");
		applicationDetail.setServiceable("Y");
		applicationDetail.setTestable("Y");
		applicationDetail.setCompatibleAssemblies(getCompatibleAssemblies());
		applicationDetail.setFunctionalTypeValues(new FunctionalType("Language Pack"));
		applicationDetail.setSellable("Y");
		applicationDetail.setResidentOnVehicle("Y");
		applicationDetail.setDigitallySigned("Y");
		applicationDetail.setConsumerViewable("Y");
		applicationDetail.setConsumerDownloadble("Y");
		applicationDetail.setDealerDownloadable("Y");
		applicationDetail.setOtaDownlable("Y");
		applicationDetail.setOtaViewable("Y");

		return applicationDetail;
	}

	private static ApplicationPartDetail getApplicationPartDetail() {

		ApplicationPartDetail applicationPartDetail = new ApplicationPartDetail();

		applicationPartDetail.setFilePN("SA-11-TT");
		applicationPartDetail.setForzenStatus("True");
		applicationPartDetail.setSuccessorPartNumber("SA-11-TS");
		applicationPartDetail.setMgmFile(getMgmFile());
		applicationPartDetail.setVersion("1.0");
		applicationPartDetail.setRuntimeSize("1664508640");

		return applicationPartDetail;
	}

	public static List<AssyPN> getCompatibleAssemblies() {
		List<AssyPN> assyPnList = new ArrayList<>();

		assyPnList.add(new AssyPN("SA-12-AAA"));
		assyPnList.add(new AssyPN("SA-12-AAB"));

		// CompatibleAssemblies compatibleAssemblies = new CompatibleAssemblies();
		// compatibleAssemblies.setAssyPN(assyPnList);

		return assyPnList;
	}
	
	private static MGMFile getMgmFile() {

		MGMFile mgmFile = new MGMFile();

		mgmFile.setProtocol(getProtocols());
		mgmFile.setFileFormat("TAR.GZ");
		mgmFile.setCheckSum("0xC7C1DA2F");
		mgmFile.setFileFingerPrint("0x61192B821A9EA47D72DD360175C7A8EE");
		mgmFile.setRomSizeKb("1664508640");
		mgmFile.setSize("1664508640");
		mgmFile.setFileDateModified(new Date());

		return mgmFile;
	}
	
	private static List<Values> getValues(){
		List<Values> values = new ArrayList<>();
		values.add(new Values("CS"));
		values.add(new Values("DA"));
		
		return values;
	}
	

	private static List<Protocol> getProtocols() {
		Protocol protocol1 = new Protocol("Yes", NetworkProtocol.USB);
		Protocol protocol2 = new Protocol("No", NetworkProtocol.OTA);
		List<Protocol> protocolList = new ArrayList<>();
		protocolList.add(protocol1);
		protocolList.add(protocol2);

		return protocolList;
	}
}
