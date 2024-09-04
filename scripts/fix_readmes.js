const fs = require("fs");

const filesWhichAreDirs = fs
  .readdirSync("../projects")
  .filter((file) => fs.lstatSync(`../projects/${file}`).isDirectory());

const projectsInMd = filesWhichAreDirs
  .filter((dir) => {
    if ([".github", "target"].includes(dir)) return false;
    return true;
  })
  .map((dir) => `- [**${dir}**](./projects/${dir}/README.md)`)
  .join("\n");

fs.writeFileSync(
  "../README.md",
  `<!--AUTOGENERATED DO NOT TOUCH -->\n` + fs
    .readFileSync("../README.template")
    .toString()
    .replace("{contents}", projectsInMd),
);
require("child_process").execSync(
  `cd .. && git config --global user.email "zeon@saahild.com"`,
);
require("child_process").execSync(
  `cd .. && git config --global user.name "Zeon [ACTIONS]"`,
);
require("child_process").execSync("cd .. && git pull");
require("child_process").execSync(
  'cd .. && git add . && git commit -m "ci(zeon): Update README.md" && git push -f',
);
