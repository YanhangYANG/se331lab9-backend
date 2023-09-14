package se331.lab.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.lab.rest.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    EventDTO getEventDto(Event event);
    List<EventDTO> getEventDto(List<Event> events);

    OrganizerDTO getOrganizerDto(Organizer organizer);

    List<OrganizerDTO> getOrganizerDto(List<Organizer> organizers);

    List<ParticipantDTO> getParticipantDto(List<Participant> participants);

    ParticipantDTO getParticipantDto(Participant participant);


}
