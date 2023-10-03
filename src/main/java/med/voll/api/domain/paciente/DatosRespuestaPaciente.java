package med.voll.api.domain.paciente;

public record DatosRespuestaPaciente(Long id, String nombre, String email, String telefono, String documentoIdentidad) {
    public DatosRespuestaPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumentoIdentidad());
    }

}
