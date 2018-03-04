package idv.carl.di.lab.spring5dilab.solid.openclosedprinciple.good;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() throws Exception {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1 = new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2 = new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }

}
