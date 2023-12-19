package Fixtures

import io.github.jimiWrd.TooDooApi.constants.Status
import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.model.TooDooTask
import java.time.LocalDate
import java.time.Month

class TestFixtures {
    companion object {
        fun createValidTooDooTask(): TooDooTask{
            return TooDooTask(
                1,
                "Collect laundry",
                "Pick it up from dry cleaners",
                Status.IN_PROGRESS.toString(),
                4,
                LocalDate.of(2023, Month.DECEMBER, 25),
                LocalDate.now()
            )
        }

        fun createValidTooDooRequest(): TooDooRequestDto {
            return TooDooRequestDto(
                "Collect Laundry",
                "Pick it up from dry cleaners",
                4,
                LocalDate.of(2023, Month.DECEMBER, 25)
            )
        }
    }
}