package coffee;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface NotifyRepository extends PagingAndSortingRepository<Notify, Long>{

    List<Notify> findByRequestId(Long requestId);
}