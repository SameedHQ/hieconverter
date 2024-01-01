package hieconverterapi.services.hapifhir.Servlets;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;

import javax.servlet.ServletException;
import java.util.ArrayList;
import java.util.List;

public class FHIRRestfulServerDCM extends RestfulServer {
    @Override
    protected void initialize() throws ServletException {
        setFhirContext(FhirContext.forR4());
        List<IResourceProvider> resourceProviders = new ArrayList<IResourceProvider>();
        setResourceProviders(resourceProviders);
    }
}
