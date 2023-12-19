package unit.io.github.jimiWrd.TooDooApi.service

import Fixtures.TestFixtures
import io.github.jimiWrd.TooDooApi.config.TooDooMapper
import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.model.TooDooTask
import io.github.jimiWrd.TooDooApi.repository.TooDooRepository
import io.github.jimiWrd.TooDooApi.service.TooDooService
import io.github.jimiWrd.TooDooApi.service.impl.TooDooServiceImpl
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mapstruct.factory.Mappers
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.test.context.ActiveProfiles

@ExtendWith(MockitoExtension::class)
class TooDooServiceUnitTests {
    @Mock
    private lateinit var tooDooRepository: TooDooRepository
    private lateinit var tooDooMapper: TooDooMapper
    private lateinit var tooDooService: TooDooService
    private lateinit var validTooDoo: TooDooTask
    private lateinit var validTooDooRequestDto: TooDooRequestDto

    @BeforeEach
    fun setup(){
        tooDooMapper = Mappers.getMapper(TooDooMapper::class.java)
        tooDooService = TooDooServiceImpl(tooDooRepository, tooDooMapper)
        validTooDoo = TestFixtures.createValidTooDooTask()
        validTooDooRequestDto = TestFixtures.createValidTooDooRequest()
    }

    @Test
    fun `service should create a valid TooDooTask entity when valid TooDooRequestDto is passed`() {
        `when`(tooDooRepository.save(any(TooDooTask::class.java))).thenReturn(validTooDoo)

        val result = tooDooService.createNewTooDooTask(validTooDooRequestDto)
        
        Assertions.assertThat(result).usingRecursiveComparison().ignoringFields("createdAt").isEqualTo(validTooDoo)
    }
}