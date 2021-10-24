package org.jhapy.cqrs.command.i18n;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImportElementsFromExcelCommand {
  @NotNull private byte[] importFile;
}